class Solution:
    def singleNumber(self, nums: List[int]) -> int:
        x=0
        for i in nums:
            print('num',i)
            x^=i
            print(x)
        return x