public ArrayList<Integer> bfsOfGraph(int V, ArrayList<ArrayList<Integer>> adj) {
        // Code here
        ArrayList<Integer> ans = new ArrayList<>();
        Queue<Integer> q = new LinkedList<>();
        int vis[] = new int[V];
        
        vis[0] = 1;
        q.add(0);
        
        while(q.size() > 0) {
            int node = q.poll();
            ans.add(node);
            
            for(int nbr: adj.get(node)) {
                if (vis[nbr] == 0) {
                    q.add(nbr);
                    vis[nbr] = 1;
                }
            }
        }
        
        return ans;
    }
