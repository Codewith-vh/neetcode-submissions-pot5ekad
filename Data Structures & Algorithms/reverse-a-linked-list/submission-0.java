/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

class Solution {
    ListNode root;
    public ListNode reverseL(ListNode node){
        if(node.next==null){
            root=node;
            return node;
        }
        reverseL(node.next).next=node;
        node.next=null;
        return node;
    }
    public ListNode reverseList(ListNode head) {
        if(head==null){
            return head;
        }
        reverseL(head);
        return root;
    }
}
