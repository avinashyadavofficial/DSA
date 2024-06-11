public class nqueen_countways {
    public static boolean issafe(char board[][],int row,int col){
        //vertical up
        for(int i=row-1;i>=0;i--){
            if(board[i][col]=='Q'){
                return false;
            }
        }
        //diagonal right up
        for(int i=row-1,j=col+1;i>=0 &&j<board.length;i--,j++){
            if(board[i][j]=='Q'){
                return false;
            }

        }
        //diagonal left up
        for(int i=row-1,j=col-1;i>=0 &&j>=0;i--,j--){
            if(board[i][j]=='Q'){
                return false;
            }

        }
        return true;

    }
    public static void nqueen(char board[][],int row){
        //base
        if(row==board.length){
            count++;
            return;
        }
        //kaam
        //column loop
        for(int col=0;col<board.length;col++){
            if(issafe(board,row,col)){
                board[row][col]='Q';
                nqueen(board, row+1); //function call
                board[row][col]='x'; //backtracking step

            }
        }
        
        
    }
    static int count=0;
    
    public static void main(String args[]){
        int n=4;
        char board[][]=new char[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                board[i][j]='x';
            }
        }
        nqueen(board, 0);
        System.out.println(count);

    }
}
