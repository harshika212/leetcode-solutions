/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int sizeA=0; int sizeB=0; 
        ListNode tempA=headA;
        ListNode tempB=headB;
        while(tempA!=null){
            sizeA++;
            tempA=tempA.next;
        }
        while(tempB!=null){
            sizeB++;
            tempB=tempB.next;
        }
        int pos = Math.abs(sizeA - sizeB);

        tempA = headA;
        tempB = headB;
        if(sizeA>sizeB){
           for(int i=0;i<pos;i++){
            tempA=tempA.next;
           }
        }else{
            for(int i=0;i<pos;i++){
                tempB=tempB.next;
            }
        }
        while(tempA!=tempB){
            tempA=tempA.next;
            tempB=tempB.next;
        }
        return tempA;
    }
}