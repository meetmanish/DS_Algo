class Solution
{
    //Function to return a list containing the DFS traversal of the graph.
    public ArrayList<Integer> dfsOfGraph(int V, ArrayList<ArrayList<Integer>> adj)
    {
        // Code here
        ArrayList<Integer> arr = new ArrayList<Integer>();
        boolean [] visited = new boolean[V];
        return DFSUtil(adj, 0, visited, arr);
        
    }
    
    ArrayList<Integer> DFSUtil(ArrayList<ArrayList<Integer>> adj, int src, 
    boolean visited[], ArrayList<Integer> arr)
    {
        visited[src] = true;
        arr.add(src);
        for(int v : adj.get(src))
        {
            if(visited[v] == false)
            {
                //visited[v] = true;
                DFSUtil(adj, v, visited, arr);
            }
        }
        return arr;
    }
    
}
