class Solution:
    def combine(self, n: int, k: int) -> List[List[int]]:
        def backtrack(s,p):
            if len(p)==k:
                res.append(p[:])
                return
            for i in range(s,n+1):
                p.append(i)
                backtrack(i+1,p)
                p.pop()
        res=[] 
        backtrack(1,[])
        return res