class Solution {
    
    public Node insertInMid(Node head, int data){
        //Insert code here, return the head of modified linked list
        Node node = new Node(data);
        if(head == null )
            return head;
        if(head.next == null)
            {
                head.next = node;
                return head;
            }
        
        Node slow = head, fast = head;
        while(fast.next != null && fast.next.next != null){
            fast = fast.next.next;
            slow = slow.next;
        }
        node.next = slow.next;
        slow.next = node;
        return head;
    }
}
