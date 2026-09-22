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
    int count=0;
    public void track(TreeNode root, ArrayList<Integer> arr){
        if(root==null){
            return;
        }
        arr.add(root.val);
        int maxi=Collections.max(arr);
        if(maxi==root.val){
            count++;
        }

        track(root.left,arr);
        track(root.right,arr);
        arr.remove(arr.indexOf(root.val));
    }
    public int goodNodes(TreeNode root) {
        ArrayList<Integer> arr = new ArrayList<Integer>();
        track(root, arr);
        return count;
    }
}
