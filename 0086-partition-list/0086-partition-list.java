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
    public ListNode partition(ListNode head, int x) {
        if(head==null){
            return null;
        }
       ListNode smallDummy = new ListNode(-1);
       ListNode bigDummy = new ListNode(-1);

       ListNode smallTail = smallDummy;
       ListNode bigTail = bigDummy;

       ListNode temp=head;
       //ListNode next = temp.next;
       while(temp!=null){
        ListNode next = temp.next;
        if(temp.val<x){
            smallTail.next=temp;
            smallTail=smallTail.next;
        }else{
            bigTail.next=temp;
            bigTail=bigTail.next;
        }
        temp=next;
       }
       
       bigTail.next=null;
       smallTail.next=bigDummy.next;
       
       return smallDummy.next;

    }
}