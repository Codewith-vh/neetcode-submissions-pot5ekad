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
    public TreeNode track(TreeNode root,int target){
        if(root==null){
            return null;
        }
        root.left=track(root.left,target);
        root.right=track(root.right,target);
        if(root.left==null && root.right==null){
            if(root.val==target){
                return null;
            }
        }
        return root;
    }

    public TreeNode removeLeafNodes(TreeNode root, int target) {
        track(root,target);
        if(root!=null && root.left==null && root.right==null){
            if(root.val==target){
                root=null;
            }
        }
        return root;
    }
}