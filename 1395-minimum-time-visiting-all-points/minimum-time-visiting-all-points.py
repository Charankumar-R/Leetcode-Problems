class Solution(object):
    def minTimeToVisitAllPoints(self, points):
        res=0                                                                   # res = 0
        x1,y1=points.pop()                  # Start at the last point     [-1, 0]
        while points:                       # While there are still points left  
            x2,y2=points.pop()              # Pop the next point           [-1, 0] to [3, 4]
            res+=max(abs(y2-y1),abs(x2-x1)) # Calculate the time to move   abs(3 - (-1)) = abs(4) = 4 abs(4 - 0) = abs(4) = 4 The time taken is max(4, 4) = 4, so res += 4  Next, we move from [3, 4] to [1, 1]. abs(1 - 3) = abs(-2) = 2 abs(1 - 4) = abs(-3) = 3 The time taken is max(2, 3) = 3, so res += 3. After visiting all the points, the total time will be res = 4 + 3 = 7.
            x1,y1=x2,y2                     # Update the current point
        return res