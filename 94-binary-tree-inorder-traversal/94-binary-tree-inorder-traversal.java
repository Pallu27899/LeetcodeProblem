/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    
List<Integer> result = new ArrayList<Integer>();
     public void Traversal(TreeNode p){
        if(p.left!=null)
            Traversal(p.left);
 
        result.add(p.val);
 
        if(p.right!=null)
            Traversal(p.right);    
    }
  public List<Integer> inorderTraversal(TreeNode root) {
     if(root !=null){
            Traversal(root);
        }
        return result;
  }
    
}