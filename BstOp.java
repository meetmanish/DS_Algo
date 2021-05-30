class Tree 
{
    //Function to return the ceil of given number in BST.
    int findCeil(Node root, int key) 
    { 
        if (root == null)
            return -1;
        // Code here
        Node res = new Node(-1);
        while(root != null){
            if(root.data == key)
                return key;
            else if(root.data<key)
                root = root.right;
            else{
                res = root;
                root = root.left;
            }
        }
        return res.data;
    } 
   //Function to return the floor of given number in BST.
    int floor(Node root, int key) 
    { 
        //code here.
        Node res = null;
        if(root == null)
            return -1;
        while(root != null){
            if(root.data == key)
                return root.data;
            else if(root.data > key)
                root = root.left;
            else {
                res = root;
                root = root.right;
            }
        }
        if(res != null)
            return res.data;
        else
            return -1;
    }
  //Function to delete a node from BST.
	public static Node deleteNode(Node root, int x)
	{
		// code here.
		if(root == null)
		    return root;
		if(root.data > x)
		    root.left = deleteNode(root.left, x);
		else if(root.data < x)
		    root.right = deleteNode(root.right, x);
		else{
		    if(root.left == null)
		        return root.right;
		    else if(root.right == null)
		        return root.left;
		    else{
		        Node next = getNext(root);
		        root.data = next.data;
		        root.right = deleteNode(root.right, next.data);
		    }
		}
		return root;
		
	}
	
	static Node getNext(Node root){
	    Node curr = root.right;
	    while( curr != null && curr.left != null){
	        curr = curr.left;
	        
	    }
	    return curr;
	}
	
   public static ArrayList<Integer> levelOrder(Node root)
    {
       // Print the nodes of tree levelwise
       ArrayList<Integer> arr = new ArrayList<Integer>();
       if(root == null)
            return arr;
        Queue<Node> q = new LinkedList<Node>();
        // root;
        q.add(root);
        while(q.isEmpty() == false){
            Node curr = q.poll(); 
            arr.add(curr.data);
            if(curr.left != null)
                q.add(curr.left);
            if(curr.right != null)
                q.add(curr.right);
            
        }
        return arr;
    }
  
  public static ArrayList<Integer> postOrder(Node root)
    {
        // your code here
        ArrayList<Integer> arr = new ArrayList<Integer>();
        if(root == null)
            return arr;
            
        arr.addAll(postOrder(root.left));
        arr.addAll(postOrder(root.right));
        arr.add(root.data);
        return arr;
        
    }
  
  ArrayList<Integer> inOrder(Node root)
    {
        // your code here
        ArrayList<Integer> arr = new ArrayList<Integer>();
        if(root == null)
            return arr;
        arr.addAll(inOrder(root.left));
        arr.add(root.data);
        arr.addAll(inOrder(root.right));
        
        return arr;
    }
  
  public static ArrayList<Integer> preOrder(Node root)
    {
        // your code here
        ArrayList<Integer> arr = new ArrayList<Integer>();
        if(root == null)
            return arr;
        arr.add(root.data);
        arr.addAll(preOrder(root.left));
        arr.addAll(preOrder(root.right));
        
        return arr;
        
    }
  //Function to search a node in BST.
    boolean search(Node root, int x)
    {
	    // Your code here
	    if(root == null)
	        return false;
	    if(root.data == x)
	        return true;
	   Node curr = root;
	    while(curr != null){
	        if(curr.data<x)
	            curr = curr.right;
	        else if(curr.data > x)
	            curr = curr.left;
	        else if(curr.data == x){
	            return true;
	        }	    
	        
	    }
	    return false;
    }
   //Function to insert a node in a BST.
    Node insert(Node root, int Key)
    {
        // your code here
        if(root == null)
            return new Node(Key);
        if(root.data > Key)
            root.left = insert(root.left, Key);
        else if(root.data < Key)
            root.right = insert(root.right, Key);
        
        return root;
    }
}
