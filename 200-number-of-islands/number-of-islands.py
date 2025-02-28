class Solution(object):
    def numIslands(self, grid):
        if not grid:
            return 0
        
        def bfs(r,c):
            q=deque()
            vist.add((r,c))
            q.append((r,c))

            while q:
                row ,col=q.popleft()
                direction=[[1,0],[-1,0],[0,1],[0,-1]]
                for dr,dc in direction:
                    nr,nc =row+dr,col+dc

                    if (0 <= nr < len(grid) and 0 <= nc < len(grid[0]) and grid[nr][nc]=='1' and (nr,nc) not in vist):
                        q.append((nr,nc))
                        vist.add((nr,nc))

        count=0
        row=len(grid)
        col=len(grid[0])
        vist=set()

        for r in range(row):
            for c in range(col):
                if grid[r][c]=='1' and (r,c) not in vist:
                    bfs(r,c)
                    count+=1
        
        return count