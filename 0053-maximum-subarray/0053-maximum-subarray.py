class Solution:
    def maxSubArray(self, arr: List[int]) -> int:
        maxSum=arr[0]
        currentSum=0

        for i in arr:
            if currentSum < 0:
                currentSum=0
            
            currentSum+=i
            maxSum=max(maxSum,currentSum)

        return maxSum