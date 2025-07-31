class Solution {
    int[] c;
    public boolean isBipartite(int[][] g) {
        c = new int[g.length]; Arrays.fill(c, -1);
        for (int i = 0; i < g.length; i++){
            if (c[i] < 0 && !dfs(g, i, 0)) {
                return false;
            }
        }
        return true;
    }
    boolean dfs(int[][] g, int u, int col) {
        if (c[u] >= 0) return c[u] == col;
        c[u] = col;
        for (int v : g[u]) 
            if (!dfs(g, v, 1 - col)) 
                return false;
        return true;
    }
}