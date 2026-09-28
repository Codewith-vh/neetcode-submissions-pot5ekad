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
    public int kthSmallest(TreeNode root, int k) {
        track(root);
        return arr.get(k-1);
    }
}
