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
    public void track(Queue q, ArrayList<List<Integer>> arr, ArrayList<Integer> sub){
        if(!q.isEmpty()){
            
            // System.out.println(q.remove());
           
            int len=q.size();
            for(int i=0;i<len;i++){
                TreeNode root=(TreeNode) q.poll();
            
            
            if(root!=null){
                
                q.add(root.left);
                q.add(root.right);
                sub.add(root.val);
                
            }}
            if(sub.size()!=0){
            arr.add(sub);}
            track(q,arr,new ArrayList<Integer>());
            
            

        }

    }
    public List<List<Integer>> levelOrder(TreeNode root) {
        Queue<TreeNode> q= new LinkedList<TreeNode>();
        ArrayList<List<Integer>> arr= new ArrayList<List<Integer>>();
        q.add(root);
        ArrayList<Integer> sub= new ArrayList<Integer>();
        track(q,arr,sub);
        return arr;
    }
}
