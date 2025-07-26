/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    private int i = 0;
    private int p = 0;

    public TreeNode buildTree(int[] preorder, int[] inorder) {
        return helper(preorder, inorder, Integer.MIN_VALUE);
    }

    private TreeNode helper(int[] pre, int[] in, int stop) {
        if(p >= pre.length) return null;
        
        if(in[i] == stop){
            ++i;
            return null;
        }

        TreeNode node = new TreeNode(pre[p++]);
        node.left = helper(pre, in ,node.val);
        node.right = helper(pre, in ,stop);
        return node;
    }
}