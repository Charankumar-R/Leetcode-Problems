class Solution {
    static int count=0;
    public int totalNQueens(int n) {
        count=0;
        int[][] arr=new int[n][n];
        queen(n,arr,0);
        return count; 
    }
    public static void count(int n,int arr[][]){
        //Count incrementation
        count++;
    }
    //to check the queen is safe
    public static boolean isSafe(int n,int arr[][],int row,int col){
        int i,j;
        //check if any queen is above
        for(i=row;i>=0;i--){
            if(arr[i][col]==1){
                return false;
            }
        }
        //check if any queen is present in top left side
        for(i=row,j=col;i>=0 && j>=0;i--,j--){
            if(arr[i][j]==1){
                return false;
            }
        }
        //check if any queen is present in top right side
        for(i=row,j=col;i>=0 && j<n;i--,j++){
            if(arr[i][j]==1){
                return false;
            }
        }
        return true;
    }
    public static void queen(int n,int arr[][],int row){
        int col;
        if(row==n){
            count(n,arr);//count method calling
        }
        else{
            for(col=0;col<n;col++){
                if(isSafe(n,arr,row,col)){
                    arr[row][col]=1;
                    queen(n,arr,row+1);
                    arr[row][col]=0;
                }
            }
        }
    }
}