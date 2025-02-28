class Solution(object):
    def maxProfit(self, prices):

        #1-> left is 1st index, right is 2nd index
        l,r=0,1

        #2-> max profit is 0 in all case
        maxp=0

        #3-> iterating through the list until right goes out of index
        while r!=len(prices):

            #4-> if left side is lesser than right side 
            if prices[l]<prices[r]:

                #5-> calculates the proft by subtracting buy time and sell time
                prof=prices[r]-prices[l]

                #6-> maximum btw current profit and previous maximum
                maxp=max(prof,maxp)
            
            #7-> if left is greater then left and right index are same
            else:
                l=r
            
            #6-> move right index always one point regardless of left index
            r+=1
        return maxp