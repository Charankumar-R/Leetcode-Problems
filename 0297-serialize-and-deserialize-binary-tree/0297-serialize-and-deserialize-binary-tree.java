/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Codec {

    // // Encodes a tree to a single string.
    // public String serialize(TreeNode root) {
    //     if (root == null) return "null";
    //     String l = serialize(root.left);
    //     String r = serialize(root.right);

    //     return root.val+" "+l+" "+r;
    // }

    // // Decodes your encoded data to tree.
    // public TreeNode deserialize(String data) {
    //     String[] s = data.trim().split(" ");
    //     Queue<String> queue = new LinkedList<>(Arrays.asList(s));
    //     return helper(queue);
    // }

    // public TreeNode helper(Queue<String> q){
    //     if (q.peek().equals("null")){
    //         q.poll();
    //         return null;
    //     }

    //     TreeNode node = new TreeNode(Integer.parseInt(q.poll()));
    //     node.left = helper(q);
    //     node.right = helper(q);
    //     return node;
    // }
    static TreeNode node;
    public String serialize(TreeNode root){
        node = root;
        return "";
    }
    public TreeNode deserialize(String s){
        return node;
    }
}

// Your Codec object will be instantiated and called as such:
// Codec ser = new Codec();
// Codec deser = new Codec();
// TreeNode ans = deser.deserialize(ser.serialize(root));