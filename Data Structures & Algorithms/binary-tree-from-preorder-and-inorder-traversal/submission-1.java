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
    int preorderInd=0;
    public TreeNode buildBT(int[] preorder, int[] inorder, int inorderStartInd, int inorderEndInd){
        
        if(preorderInd>=preorder.length){
            return null;
        }
        if(inorderStartInd>inorderEndInd){
            return null;
        }

        TreeNode node= new TreeNode(preorder[preorderInd]);
        int eleInd=0;
        for(int i=inorderStartInd;i<=inorderEndInd;i++){
            if(inorder[i]==node.val){
                eleInd=i;
                break;
            }
        }     
        preorderInd+=1;
        node.left=buildBT(preorder,inorder,inorderStartInd,eleInd-1);
        node.right=buildBT(preorder,inorder,eleInd+1,inorderEndInd);
        return node;

    }
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        return buildBT(preorder,inorder,0,inorder.length-1);
    }
}
