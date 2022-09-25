/*
// Definition for a Node.
class Node {
    public int val;
    public Node left;
    public Node right;
    public Node next;

    public Node() {}
    
    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, Node _left, Node _right, Node _next) {
        val = _val;
        left = _left;
        right = _right;
        next = _next;
    }
};
*/

class Solution {
    public Node connect(Node root) {
         if(root == null){
            return null;
        }
        Queue<Node> res  = new LinkedList<>();
        res.offer(root);
        while(!res.isEmpty()) {
            Node rightNode = null;
            for(int i = res.size(); i > 0; i--) {
                Node curr = res.poll();
                curr.next = rightNode;
                rightNode = curr;
                if(curr.right != null) {
                    res.offer(curr.right);
                   res.offer(curr.left);
                }
            }
        }
        return root;        
    }
}