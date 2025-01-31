class Solution {
    public void solveSudoku(char[][] board) {
        solve(board,0,0);
    }
    public static int isSafe(char[][] arr,int row,int col,char d){
        int i,j;
        for(i=0;i<9;i++){
            if(arr[row][i]==d){
                return 0;
            }
        }
        for(i=0;i<9;i++){
            if(arr[i][col]==d){
                return 0;
            }
        }
        int x=(row/3)*3;
        int y=(col/3)*3;
        for(i=x;i<x+3;i++){
            for(j=y;j<y+3;j++){
                if(arr[i][j]==d){
                    return 0;
                }
            }
        }
        return 1;
    }
    public boolean solve(char[][] board,int row,int col){
        if(row==8 && col==9){
            return true;
        }
        else{
            if(col==9){
                return solve(board,row+1,0);
            }
            if(board[row][col]!='.')
            {
                return solve(board,row,col+1);
            }
            else{
                for(char i='1';i<='9';i++){
                    if(isSafe(board,row,col,i)==1){
                        board[row][col]=i;
                        if(solve(board, row, col + 1)){
                            return true;
                        }
                        board[row][col]='.';
                    }
                }
            }       
        }
        return false;
        
    }
}