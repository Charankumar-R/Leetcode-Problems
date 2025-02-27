class Solution(object):
    def smallerNumbersThanCurrent(self, nums):
        """
        :type nums: List[int]
        :rtype: List[int]
        """               
                                            #nums = [8,1,2,2,3]
        temp=sorted(nums)                   #temp = [1,2,2,3,8]
        d={}                                #d    = {}

        for i,v in enumerate(temp):         #i-index v-value 
            if v not in d:
                d[v]=i
                                            #d={1:0,2:1,3:3,8:4} numbers in temp are key , as well as index in temp are values key-value pair
        ret=[]                              #ret =[]
        for i in nums:
            ret.append(d[i])                #d[8]=4,d[1]=0,d[8]=1,d[8]=1,d[8]=3
        
        return ret                          #ret=[4,0,1,1,3]