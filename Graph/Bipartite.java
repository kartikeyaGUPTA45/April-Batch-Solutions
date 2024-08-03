public boolean isBipartite(int V, ArrayList<ArrayList<Integer>>adj)
    {
        // Code here
        int color[] = new int[V];
        Arrays.fill(color,-1);
        
        for(int node = 0;node<V;node++) {
            if (color[node] == -1) {
                if (bfs(node,color,adj) == false) {
                    return false;
                }
            }
        }
        
        return true;
    }
    
    public boolean bfs(int node, int color[], ArrayList<ArrayList<Integer>> adj) {
        Queue<Integer> q = new LinkedList<>();
        q.add(node);
        
        while(q.size() > 0) {
            node = q.poll();
            
            for(int nbr: adj.get(node)) {
                if (color[nbr] == -1) {
                    color[nbr] = 1-color[node];
                    q.add(nbr);
                } else if (color[nbr] == color[node]) {
                    return false;
                }
            }
        }
        
        return true;
        
    }
