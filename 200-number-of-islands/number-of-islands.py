class Solution(object):
    def numIslands(self, grid):
        if not grid:
            return 0  # If the grid is empty, return 0 (no islands)

        def bfs(r, c):
            # Initialize a queue for BFS and mark the starting cell as visited
            q = deque()
            vist.add((r, c))
            q.append((r, c))

            # BFS loop to explore all connected '1's
            while q:
                row, col = q.popleft()  # Pop the front element from the queue
                direction = [[1, 0], [-1, 0], [0, 1], [0, -1]]  # Directions to explore (down, up, right, left)
                for dr, dc in direction:  # Loop over each direction
                    nr, nc = row + dr, col + dc  # Calculate the new row and column

                    # Check if the new cell is within bounds, is land, and has not been visited
                    if 0 <= nr < len(grid) and 0 <= nc < len(grid[0]) and grid[nr][nc] == '1' and (nr, nc) not in vist:
                        q.append((nr, nc))  # Add the new cell to the queue
                        vist.add((nr, nc))  # Mark the new cell as visited

        count = 0  # This will hold the number of islands
        row = len(grid)
        col = len(grid[0])
        vist = set()  # Set to keep track of visited cells

        # Iterate over each cell in the grid
        for r in range(row):
            for c in range(col):
                # If we find an unvisited land cell ('1'), start BFS to explore the island
                if grid[r][c] == '1' and (r, c) not in vist:
                    bfs(r, c)  # Call BFS to explore this island
                    count += 1  # Increment the island count

        return count  # Return the final count of islands
