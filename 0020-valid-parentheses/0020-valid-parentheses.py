class Solution(object):
    def isValid(self, s):
        stack = []
        dic={')':'(', '}':'{',']':'['}
        for i in s:
            if stack and (i in dic and stack[-1] == dic[i]):
                stack.pop()
            else:
                stack.append(i)
        return not stack