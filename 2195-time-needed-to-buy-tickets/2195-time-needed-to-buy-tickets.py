class Solution(object):
    def timeRequiredToBuy(self, tickets, k):
        """
        :type tickets: List[int]
        :type k: int
        :rtype: int
        """
        res=0
        for i in range(len(tickets)):
            if i<=k:
                res += min(tickets[i], tickets[k])
            else:
                res += min(tickets[i], tickets[k]-1)
        return res