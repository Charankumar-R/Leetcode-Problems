# Definition for a binary tree node.
# class TreeNode(object):
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution(object):
    def invertTree(self, root):
        """
        :type root: Optional[TreeNode]
        :rtype: Optional[TreeNode]
        """
        "DFS with Stack"
        """
        stack = [root]
        while stack:
            curr = stack.pop()
            if curr:
                curr.left, curr.right = curr.right, curr.left
                stack.extend([curr.right, curr.left])
        return root
        """
        "DFS Recursive"
        if root:
            root.left, root.right = self.invertTree(root.right), self.invertTree(root.left)
            return root