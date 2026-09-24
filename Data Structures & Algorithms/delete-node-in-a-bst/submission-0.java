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
    int maxVal= Integer.MAX_VALUE;
    TreeNode replace;
     public TreeNode search(TreeNode root, int val){
        if(root==null){
            return null;
        }
        if(val>root.val){
             root.right=search(root.right,val);
        }
        else if(val<root.val){
             root.left=search(root.left,val);
        }   
        else{
            if(root.left==null && root.right==null){
                return null;
            }
            else if(root.left==null){
                return root.right;
            }
            else if(root.right==null){
                return root.left;
            }
            else{

                root.val=delete(root.right).val;
                root.right=search(root.right,root.val);
                return root;
            }
        } 

        return root;
 
    }
    public TreeNode delete(TreeNode root){
        if(root==null){
            return null;
        }
        if(maxVal>root.val){
            maxVal=root.val;
            replace=root;
        }
        delete(root.left);
        delete(root.right);
        return replace;
    }
    public TreeNode deleteNode(TreeNode root, int key) {
        if(root==null){
            return root;
        }
       return search(root,key);
    }
}