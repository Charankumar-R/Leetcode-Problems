class Solution(object):
    
    def balanceBST(self, root):
        """
        :type root: Optional[TreeNode]
        :rtype: Optional[TreeNode]
        """
        def inorder_traversal(root): 
            nodes = []
            stack = []
            curr = root
            while curr or stack:
                while curr:
                    stack.append(curr)
                    curr = curr.left
                curr = stack.pop()
                nodes.append(curr.val)
                curr = curr.right
            return nodes

        def sorted_array_to_bst(nums): 
            if not nums:
                return None
            mid = len(nums) // 2
            root = TreeNode(nums[mid])
            root.left = sorted_array_to_bst(nums[:mid])
            root.right = sorted_array_to_bst(nums[mid+1:])
            return root
            
        nums = inorder_traversal(root) 
        return sorted_array_to_bst(nums)
