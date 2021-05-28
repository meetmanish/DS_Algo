class Solution
{
    //Function to return the level order traversal of a tree.
    static ArrayList <Integer> levelOrder(Node node) 
    {
        // Your code here
        ArrayList <Integer> arr = new ArrayList <Integer>();
        if(node == null)
            return arr;
        Queue<Node> q = new LinkedList<Node>();
        q.add(node);
        while(q.isEmpty() == false){
            Node curr = q.poll();
            arr.add(curr.data);
            if(curr.left != null)
                q.add(curr.left);
            if(curr.right != null){
                q.add(curr.right);
            }
        }
        
        return arr;
    }
}
