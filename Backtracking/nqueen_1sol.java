public class nqueen_1sol {
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
    public static boolean nqueen(char board[][],int row){
        //base
        if(row==board.length){
            count++;
            return true;
        }
        //kaam
        //column loop
        for(int col=0;col<board.length;col++){
            if(issafe(board,row,col)){
                board[row][col]='Q';
                if(nqueen(board, row+1)){
                    return true;
                } //function call
                board[row][col]='x'; //backtracking step

            }
        }
        return false;
    }
    static int count=0;
    public static void printboard(char board[][]){
        System.out.println("------CHESS BOARD------");
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board.length;j++){
                System.out.print(board[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
        int n=2;
        char board[][]=new char[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                board[i][j]='x';
            }
        }
        if(nqueen(board, 0)){
            System.out.println("solution is possible");
            printboard(board);
        }
        else{
            System.out.println("solution is not possible");
        }
        


    }
}
