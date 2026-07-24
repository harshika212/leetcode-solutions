/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public void deleteNode(ListNode node) {
        node.val=node.next.val; 
        node.next=node.next.next;
    }
}
 //here just store the value of the next node in the place of "node" and skip the next node value this way the node doesnt get deleted from the memory just make it seem like it did