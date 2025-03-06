class Solution(object):
    def threeSum(self, nums):
        """
        :type nums: List[int]
        :rtype: List[List[int]]
        """
        trip=[]
        nums.sort()
        for ind,val in enumerate(nums):
            if (ind>0) and (val == nums[ind-1]):
                continue
            
            left=ind+1
            right=len(nums)-1

            while left<right:
                curr_sum=val+nums[left]+nums[right]
                if curr_sum>0:
                    right-=1
                elif curr_sum<0:
                    left+=1
                else:
                    trip.append([val,nums[left],nums[right]])
                    left+=1
                    while (left<right) and (nums[left] == nums[left-1]):
                        left+=1
                    
        return trip