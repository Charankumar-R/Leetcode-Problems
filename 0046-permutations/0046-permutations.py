class Solution(object):
    def permute(self, nums):
        def backtrack(start,end):
            if start==end:
                res.append(nums[:])
                return
            for i in range(start,end):
                nums[start],nums[i]=nums[i],nums[start]
                backtrack(start+1,end)
                nums[start],nums[i]=nums[i],nums[start]
        res=[]
        backtrack(0,len(nums))
        return res