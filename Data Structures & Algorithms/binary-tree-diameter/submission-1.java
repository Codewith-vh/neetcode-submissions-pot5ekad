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

    public int track(TreeNode node){
        int val1=0,val2=0;
        if(node==null){
            return 0;
        }
        else{
            
            val1=track(node.left)+1;
            val2=track(node.right)+1;
            
        }
        if(val1>val2){
                return val1;
            }
            else{
                return val2;
            }
        
    }
    public int diameterOfBinaryTree(TreeNode root) {
        if(root==null){
            return 0;
        }
        ArrayList<Integer> arr= new ArrayList<Integer>();
        arr.add(diameterOfBinaryTree(root.left));
        arr.add(diameterOfBinaryTree(root.right));
        arr.add(track(root.left)+track(root.right));
        return Collections.max(arr);
    }
}
