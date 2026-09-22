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
    public boolean same(TreeNode p, TreeNode q, boolean bool){
        if(p==null && q!=null){
            return false;
        }
        if(p!=null && q==null){
            return false;
        }
        if(p==null && q==null){
            return true;
        }
        if(p.val!=q.val){
            return false;
        }
        boolean a=true,b=true;
        a=same(p.left,q.left,bool);
        b=same(p.right,q.right,bool);
        bool= a && b;
        return bool;
    }
    public boolean isSameTree(TreeNode p, TreeNode q) {
        boolean bool=true;
        bool=same(p,q,bool);
        return bool;
    }
}
