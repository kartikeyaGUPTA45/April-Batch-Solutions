public ArrayList<Integer> dfsOfGraph(int V, ArrayList<ArrayList<Integer>> adj) {
        // Code here
        ArrayList<Integer> ans = new ArrayList<>();
        int vis[] = new int[V];
        
        dfs_helper(0,vis,ans,adj);
        
        return ans;
    }
    
    public void dfs_helper(int node, int vis[], ArrayList<Integer> ans, ArrayList<ArrayList<Integer>> adj) {
        vis[node] = 1;
        
        ans.add(node);
        
        for(int nbr:adj.get(node)) {
            if (vis[nbr] == 0) {
                dfs_helper(nbr, vis, ans,adj);
            }
        }
    }
