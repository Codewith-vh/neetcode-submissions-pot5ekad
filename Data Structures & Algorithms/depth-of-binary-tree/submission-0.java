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
    public int track(TreeNode root, int max, int curr){
        if(root==null){
            if(max<curr){
                max=curr;
            }
            
            return max;
        }
        else{
            curr+=1;
            int val1=track(root.left,max,curr);
            int val2=track(root.right,max,curr);
            if(val1<val2){
                max=val2;
            }
            else{
                max=val1;
            }
        }
        return max;
    }
    public int maxDepth(TreeNode root) {
        int max=0, curr=0;
        max=track(root,max,curr);
        return max;
    }
}
