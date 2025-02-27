class Solution(object):
    def twoSum(self, nums, target):
        hashMap={}
        for i,v in enumerate(nums):
            if target-v in hashMap:
                return i,hashMap[target-v]
            else:
                hashMap[v]=i