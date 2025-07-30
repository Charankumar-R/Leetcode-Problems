class Solution {
    public TreeNode sortedListToBST(ListNode head) {
        if (head == null) return null;
        return BST(head, null);
    }

    public TreeNode BST(ListNode head, ListNode tail) {
        if (head == tail) return null;

        ListNode slow = head, fast = head;
        while (fast != tail && fast.next != tail) {
            fast = fast.next.next;
            slow = slow.next;
        }

        TreeNode root = new TreeNode(slow.val);
        root.left = BST(head, slow);
        root.right = BST(slow.next, tail);
        return root;
    }
}