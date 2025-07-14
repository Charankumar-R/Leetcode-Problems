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
    public int getDecimalValue(ListNode head) {
        int c = 1;
        int num = 0;
        ListNode cur = head;

        while(cur != null){
            cur = cur.next;
            c *=2;
        }
        c /= 2;
        cur = head;
        while(cur != null){
            num += cur.val * c;
            c /=2;
            cur = cur.next;
        }
        return num;
    }
}