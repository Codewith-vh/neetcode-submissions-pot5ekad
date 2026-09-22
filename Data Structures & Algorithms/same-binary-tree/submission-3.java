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
    public boolean same(TreeNode p, TreeNode q){
        if(p==null && q!=null){
            return false;
        }
        else if(p!=null && q==null){
            return false;
        }
        else if(p==null && q==null){
            return true;
        }
        if(p.val!=q.val){
            return false;
        }
        boolean a=same(p.left,q.left);
        boolean b=same(p.right,q.right);

        return a && b;
    }
    public boolean isSameTree(TreeNode p, TreeNode q) {
        return same(p,q);

    }
}
