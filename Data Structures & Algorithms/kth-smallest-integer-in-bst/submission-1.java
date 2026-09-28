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
    public int track(TreeNode root, int k){
        if(root==null){
            return 0;
        }
        
        track(root.left,k);
        arr.add(root.val);
        k--;
if(k==0){
            return root.val;
        }
        track(root.right,k);
        return 0;
    }
    public int kthSmallest(TreeNode root, int k) {
        track(root,k);
        return arr.get(k-1);
    }
}
