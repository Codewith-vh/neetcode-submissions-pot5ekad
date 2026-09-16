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
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(p.val>q.val){
            TreeNode temp=p;
            p=q;
            q=temp;
            
        }
        if(p==root || q==root){
            return root;
        }
        // System.out.println(p.val+" "+q.val+" "+root.val);
        if(p.val<root.val && q.val>root.val){
            return root;
        }
        else if(p.val<root.val && q.val<root.val){
                        // System.out.println("hey");

            return lowestCommonAncestor(root.left,p,q);
        }
        else{
                        // System.out.println("hey1");

            return lowestCommonAncestor(root.right,p,q);
        }
    }
}
