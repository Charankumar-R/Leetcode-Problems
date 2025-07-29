class Solution {

    private boolean color(int src, int [][]graph, int []col){
        Queue<Integer> q = new LinkedList<>();
        q.offer(src);
        col[src] = 0;

        while(!q.isEmpty()){
            int curr = q.poll();
            for(int neighbour : graph[curr]){
                if(col[neighbour] == -1){
                    col[neighbour] = 1-col[curr];
                    q.offer(neighbour);
                }else if(col[neighbour] == col[curr]){
                    return false;
                }
            }
        }

        return true;
    }
    public boolean isBipartite(int[][] graph) {
        int n = graph.length;
        int []col = new int[n];
        Arrays.fill(col,-1);

        for(int i=0; i<n; i++){
            if(col[i] == -1){
                if(!color(i,graph,col)){
                    return false;
                }
            }
        }
        return true;
    }
}