class Solution(object):
    def sortedSquares(self, nums):
        """
        :type nums: List[int]
        :rtype: List[int]
        """
        '''
        #edge case
        if not nums:
            return nums
        
        if nums[0]>0:
            return [num**2 for num in nums]

        l=len(nums)
        if nums[l-1]<0:
            return [num**2 for num in reversed(nums)]
            
        #find index first positive
        m=0
        for i,n in enumerate(nums):
            if n>=0:
                m=i
                break
        
        #A-> positve nums
        #B-> negatives in reversed order
        
        A,B=nums[m:],[-1*n for n in reversed(nums[:m])]
        def merge(A,B):
            a=b=0
            ret=[]
            while a<len(A) and b<len(B):
                if A[a] < B[b]:
                    ret.append(A[a])
                    a+=1
                else:
                    ret.append(B[b])
                    b+=1
                
            if a<len(A):
                ret.extend(A[a:])
            else:
                ret.extend(B[b:])
            
            return [n**2 for n in ret]
        
        return merge(A,B)
        '''

        ans=collections.deque()
        l,r=0,len(nums)-1

        while l<=r:
            left,right=abs(nums[l]),abs(nums[r])
            if left > right:
                ans.appendleft(left*left)
                l+=1
            else:
                ans.appendleft(right*right)
                r-=1
        
        return list(ans)