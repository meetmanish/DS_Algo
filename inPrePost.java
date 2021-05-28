// class Node{
//     int data;
//     Node left,right;
//     Node(int d){
//         data=d;
//         left=right=null;
//     }
// }

class BinaryTree
{
    //Function to return a list containing the preorder traversal of the tree.
    static ArrayList<Integer> preorder(Node root)
    {
        // Code here
        ArrayList<Integer> arr = new ArrayList<>();
        if(root == null)
            return arr;
        else{
            arr.add(root.data);
            arr.addAll(preorder(root.left));
            arr.addAll(preorder(root.right));
        }
        return arr;
    }
  
  ArrayList<Integer> inOrder(Node root)
    {
        // Code
        ArrayList<Integer> arr = new ArrayList<>();
        if(root == null)
            return arr;
        else{
            arr.addAll(inOrder(root.left));
            arr.add(root.data);
            arr.addAll(inOrder(root.right));
        }
        return arr;
    }
  
  
  ArrayList<Integer> postOrder(Node root)
    {
       // Your code goes here
       ArrayList<Integer> arr = new ArrayList<>();
       if(root == null){
            return arr;
       }
       else{
           arr.addAll(postOrder(root.left));
           arr.addAll(postOrder(root.right));
           arr.add(root.data);
       }
       return arr;
    }
    //height of a tree
    int height(Node node) 
    {
        // code here 
        if(node == null)
            return 0;
        else{
            return (Math.max(height(node.left),height(node.right))+1);
        }
        
    }

}
