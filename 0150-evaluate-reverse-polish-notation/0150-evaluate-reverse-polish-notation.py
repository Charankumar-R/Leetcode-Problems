class Solution(object):
    def evalRPN(self, tokens):
        stack = []
        for t in tokens:
            if t not in "+-*/":
                stack.append(int(t))
            else:
                a,b=stack.pop(),stack.pop()
                if t=="+":
                    stack.append(a+b)
                elif t=="-":
                    stack.append(b-a)
                elif t=="*":
                    stack.append(a*b)
                else:
                    stack.append(int(float(b)/a))
        return stack.pop()
        