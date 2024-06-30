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
    public ListNode reverse(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }

        ListNode prev = null, curr = head;

        while(curr != null) {
            ListNode backUp = curr.next;

            curr.next = prev;
            prev = curr;

            curr = backUp;
        }

        return prev;
    }


    public boolean isPalindrome(ListNode head) {
        if (head == null || head.next == null) {
            return true;
        }

        ListNode fast = head, slow = head;

        while(fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        slow = reverse(slow);

        ListNode a = head;
        ListNode b = slow;

        while (a != null) {
            if (a.val != b.val) {
                return false;
            }

            a = a.next;
            b = b.next;
        }

        slow = reverse(slow);
        return true;

        
    }
}
