class Solution {
    public List<List<String>> solveNQueens(int n) {
        List<List<String>> output=new ArrayList<>();
        int[][] arr=new int[n][n];

        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                arr[i][j]=0;
            }
        }
        queen(output,n,arr,0);
        return output;

    }
    public static boolean isSafe(int n,int arr[][],int row,int col){
        int i,j;
        for(i=row;i>=0;i--){
            if(arr[i][col]==1){
                return false;
            }
        }
        for(i=row,j=col;i>=0&&j>=0;i--,j--){
            if(arr[i][j]==1){
                return false;
            }
        }
        for(i=row,j=col;i>=0&&j<n;i--,j++){
            if(arr[i][j]==1){
                return false;
            }
        }
        return true;
    }
    public static void queen(List<List<String>> output,int n,int arr[][],int row){
        int col;
        if(row==n){
            List<String> lst=new ArrayList<>();
            for(int i=0;i<n;i++){
                char ch[]=new char[n];
                for(int j=0;j<n;j++){
                    if(arr[i][j]==1){
                        ch[j]='Q';
                    }
                    else{
                        ch[j]='.';
                    }
                }
                lst.add(String.valueOf(ch));
            }
            output.add(lst);
        }
        else{
            for(col=0;col<n;col++){
                if(isSafe(n,arr,row,col)){
                    arr[row][col]=1;
                    queen(output,n,arr,row+1);
                    arr[row][col]=0;
                }
            }
        }
    }
}