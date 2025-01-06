class Solution(object):
    def maximumGroups(self, grades):
        """
        :type grades: List[int]
        :rtype: int
        """
        n=len(grades)
        count=int(math.floor((-1+math.sqrt(1+8*n))/2))
        return count
        