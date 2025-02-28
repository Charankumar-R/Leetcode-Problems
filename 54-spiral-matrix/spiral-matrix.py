class Solution(object):
    def spiralOrder(self, matrix):
        res=[]

        while matrix:

            #1-> add first row of matrix
            res+=(matrix.pop(0))

            #2-> append last element of list in order
            if matrix and matrix[0]:
                for row in matrix:
                    res.append(row.pop())

            #3-> add reverse of last row
            if matrix:
                res+=(matrix.pop()[::-1])

            #4-> append first element of all rows/lists in reverse
            if matrix and matrix[0]:
                for row in matrix[::-1]:
                    res.append(row.pop(0))
        return res