class Solution {
    int[] state; List<Integer>[] g;
    public boolean canFinish(int n, int[][] pre) {
        state = new int[n]; g = new List[n];
        for (int i = 0; i < n; g[i++] = new ArrayList<>());
        for (int[] p : pre) g[p[1]].add(p[0]);
        for (int i = 0; i < n; i++) if (!dfs(i)) return false;
        return true;
    }
    boolean dfs(int u) {
        if (state[u] == 1) return false; 
        if (state[u] == 2) return true; 
        state[u] = 1; 
        for (int v : g[u]) if (!dfs(v)) return false;
        state[u] = 2; 
        return true;
    }
}
