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
    ArrayList<Integer> arr= new ArrayList<Integer>();
    public void track(TreeNode root){
        if(root==null){
            return;
        }
        track(root.left);
        arr.add(root.val);
        track(root.right);
    }
    public boolean isValidBST(TreeNode root) {
        
        if(root.right==null && root.left==null){
            return true;
        }
        track(root);
        for(int i=0;i<arr.size()-1;i++){
            if(!(arr.get(i)<arr.get(i+1))){
                return false;
            }
        }
        return true;

    }
}
