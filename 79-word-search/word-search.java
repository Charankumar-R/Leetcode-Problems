class Solution {
    public boolean exist(char[][] board, String word) {
        int row=board.length;
        int col=board[0].length;
        int len=word.length();
        int i,j;
        for(i=0;i<row;i++){
            for(j=0;j<col;j++){
                if(board[i][j]==word.charAt(0)){
                    if(solve(row,col,board,i,j,word,0)){
                        return true;
                    }
                }
            }
        }
        return false;
    }
    public static boolean solve(int row,int col,char board[][],int i,int j,String word,int ind){
        if(ind==word.length()){
            return true;
        }
        if(i==-1||j==-1||i==row||j==col||board[i][j]!=word.charAt(ind)){
            return false;
        }
        else{
            char temp=board[i][j];
            board[i][j]='!';
            boolean top=solve(row,col,board,i-1,j,word,ind+1);
            boolean bott=solve(row,col,board,i+1,j,word,ind+1);
            boolean left=solve(row,col,board,i,j-1,word,ind+1);
            boolean right=solve(row,col,board,i,j+1,word,ind+1);
            board[i][j]=temp;
            return(top||bott||left||right);
        }
    }
}