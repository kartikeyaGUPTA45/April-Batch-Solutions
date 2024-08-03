class Solution {
    public int countComponents(int n, int[][] edges) {
        List<List<Integer>> adjList = new ArrayList<>();

        for(int i=0;i<n;i++) {
            adjList.add(new ArrayList<>());
        }

        for(int edge[] : edges) {
            int v = edge[0];
            int u = edge[1];

            adjList.get(u).add(v);
            adjList.get(v).add(u);
        }

        int count = 0;
        int vis[] = new int[n];
        for(int node = 0; node < n;node++) {
            if (vis[node] == 0) {
                count++;
                dfs_helper(node,vis,adjList);
            }
        }

        return count;
    }

    public void dfs_helper(int node, int vis[], List<List<Integer>> adjList) {
        vis[node] = 1;

        for(int nbr: adjList.get(node)) {
            if (vis[nbr] == 0) {
                dfs_helper(nbr, vis, adjList);
            }
        }
    }
}
