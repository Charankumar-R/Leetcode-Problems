class Solution {
    public static int dfs(int i,int j,int matrix[][],int dp[][],int dirs[][]){
        if(dp[i][j]!=0) return dp[i][j];

        int maxPath=1;
        for(int[] dir:dirs){
            int row=i+dir[0];
            int col=j+dir[1];
            if(row>=0 && col>=0 && row<matrix.length && col<matrix[0].length && matrix[i][j]<matrix[row][col]){
                maxPath=Math.max(maxPath,dfs(row,col,matrix,dp,dirs)+1);
            }
        }
        dp[i][j]=maxPath;
        return maxPath;
    }
    public int longestIncreasingPath(int[][] matrix) {
        
        int m=matrix.length;
        int n=matrix[0].length;
        int dp[][]=new int[m][n];
        int max=0;
        int dirs[][]={{0,1},{1,0},{0,-1},{-1,0}};
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                max=Math.max(max,dfs(i,j,matrix,dp,dirs));
            }
        }
    
        return max;
    }
}