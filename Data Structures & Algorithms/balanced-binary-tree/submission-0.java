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
    public int height(TreeNode node){
        if(node==null){
            return 0;
        }
        int val1=height(node.right)+1;
        int val2=height(node.left)+1;
        if(val1>val2){
            return val1;
        }
        return val2;
    }
    public boolean isBalanced(TreeNode root) {
        if(root==null){
            return true;
        }
        int l=height(root.left);
        int r=height(root.right);
        if(Math.abs(l-r)>1){
            return false;
        }
        if(!isBalanced(root.left)){
            return false;
        }
        if(!isBalanced(root.right)){
            return false;
        }
        return true;
    }
}
