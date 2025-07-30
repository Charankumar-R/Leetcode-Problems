class Solution {
    private int timer = 0;
    
    public List<List<Integer>> criticalConnections(int n, List<List<Integer>> connections) {
        List<Integer>[] adj = new ArrayList[n];
        for (int i = 0; i < n; i++) adj[i] = new ArrayList<>();

        for (List<Integer> edge : connections) {
            int u = edge.get(0), v = edge.get(1);
            adj[u].add(v);
            adj[v].add(u);
        }

        int[] tin = new int[n];
        int[] low = new int[n];
        boolean[] visited = new boolean[n];
        List<List<Integer>> bridges = new ArrayList<>();

        dfs(0, -1, adj, tin, low, visited, bridges);
        return bridges;
    }

    private void dfs(int node, int parent, List<Integer>[] adj, int[] tin, int[] low, boolean[] visited, List<List<Integer>> bridges) {
        visited[node] = true;
        tin[node] = low[node] = ++timer;

        for (int neighbor : adj[node]) {
            if (neighbor == parent) continue;
            if (!visited[neighbor]) {
                dfs(neighbor, node, adj, tin, low, visited, bridges);
                low[node] = Math.min(low[node], low[neighbor]);
                if (low[neighbor] > tin[node]) {
                    bridges.add(Arrays.asList(node, neighbor));
                }
            } else {
                low[node] = Math.min(low[node], tin[neighbor]);
            }
        }
    }
}