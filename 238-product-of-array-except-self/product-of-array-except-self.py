class Solution:
    def productExceptSelf(self, nums: List[int]) -> List[int]:
        n=len(nums)
        result=[0]*n

        left_products=[1]*n
        left_product=1
        for i in range(n):
            left_products[i]=left_product
            left_product*=nums[i]
        
        right_product=1
        for i in range(n-1,-1,-1):
            result[i]=left_products[i]*right_product
            right_product*=nums[i]
        
        return result