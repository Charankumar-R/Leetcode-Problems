class Solution(object):
    def threeSum(self, nums):
        """
        :type nums: List[int]
        :rtype: List[List[int]]
        """
        #populate with unique i,j,k==0
        trip=[]

        nums.sort()

        #first loop through considering i
        for ind,val in enumerate(nums):
            
            #if i is same as prev val: has already been evaluated
            if (ind>0) and (val == nums[ind-1]):
                continue
            
            left=ind+1
            right=len(nums)-1

            #when indx is penultimate left ind(j) == right(k)
            while left<right:

                curr_sum=val+nums[left]+nums[right]

                if curr_sum==0:
                    trip.append([val,nums[left],nums[right]])

                    left+=1

                    #keep evaluating for more solutions while Skip duplicate left and right values
                    while left<right and nums[left] == nums[left-1]:
                        left+=1
                    while left<right and nums[right-1]==nums[right]:
                        right-=1

                elif curr_sum<0:
                    left+=1

                else:
                    right-=1
                    
        return trip