class Solution:
    def countNumbersWithUniqueDigits(self, n: int) -> int:
        if n == 0:
            return 1  
        total_count = 1     
        for k in range(1, n + 1):
            count = 9 
            for i in range(1, k):  
                count *= (10 - i)  
            total_count += count
        return total_count