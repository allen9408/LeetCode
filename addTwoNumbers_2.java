/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode tmp = new ListNode(0);
        ListNode result = tmp;
        int carry = 0;
        while (l1 != null || l2 != null || carry != 0) {
            int sum = ((l1==null)?0:l1.val) + ((l2==null)?0:l2.val) + carry;
            tmp.val += sum % 10;
            carry = sum / 10;
            l1 = (l1 == null)? null: l1.next;
            l2 = (l2 == null)? null: l2.next;
            if (l1 != null || l2 != null || carry != 0)
                tmp = tmp.next = new ListNode(0);
        }
        return result;
    }
}