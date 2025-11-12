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
    public ListNode reverseList(ListNode head) {
        // There isn't a node before head
        ListNode prev = null;
        // First node
        ListNode cur = head;

        while(cur != null){
            // Placeholder
            ListNode tmp = cur.next;
            // The node after the current node is the node previos to the current node
            // so current node is pointing to the previous node now
            // because cur.next isn't a node, it's what cur is pointing to
            // and tmp is the what cur was originally pointing to before this
            cur.next = prev;
            // The positions move up, so prev become the current node which is pointing
            // to the original prev
            prev = cur;
            // Moves up the position of this too, to go through the linked list,
            // so the current node is the next node (tmp) and the previous node
            // is the original current node (cur)
            cur = tmp;
        }

        // Returns prev because it's been placed in the correct position
        return prev;
    }
}
