class Solution(object):
    def letterCasePermutation(self, s):
        out=[""]
        for c in s:
            tmp=[]
            if c.isalpha():
                for o in out:
                    tmp.append(o+c.lower())
                    tmp.append(o+c.upper())
            else:
                for o in out:
                    tmp.append(o+c)
            out=tmp
        return out