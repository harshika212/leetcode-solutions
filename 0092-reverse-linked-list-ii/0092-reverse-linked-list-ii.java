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
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if(head==null || left==right){
            return head;
        }
        ListNode dummy=new ListNode(-1);
        dummy.next=head;
        ListNode prev=dummy;
        for(int i=1;i<left;i++){
            prev=prev.next;
        }
        // reversing
        ListNode curr=prev.next;
        ListNode reversePrev=null;
        ListNode next=null;
        for(int i=0;i<=right-left;i++){
            next=curr.next;
            curr.next=reversePrev;
            reversePrev=curr;
            curr=next;
        }
        // connecting two nodes
        prev.next.next=curr;
        prev.next=reversePrev;
        return dummy.next;
        

    }
}