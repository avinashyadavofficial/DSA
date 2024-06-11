import java.util.*;

public class spiral_matrix {
    public static void sol(int arr[][]){
        int srow=0;
        int erow=arr.length-1;
        int scol=0;
        int ecol=arr[0].length-1;
        while(srow<=erow && scol<=ecol){
            //top
            for(int i=scol;i<=ecol;i++){
                System.out.print(arr[srow][i]+" ");
            }
            //right
            for(int i=srow+1;i<=erow;i++){
                System.out.print(arr[i][ecol]+" ");
            }
            //bottom
            for(int i=ecol-1;i>=scol;i--){
                if(srow==erow){
                    break;
                }
                
                System.out.print(arr[erow][i]+" ");
            }
            //left
            for(int i=erow-1;i>=srow+1;i--){
                if(scol==ecol){
                    break;
                }
                System.out.print(arr[i][scol]+" ");
            }
            srow++;
            erow--;
            scol++;
            ecol--;


        }
        System.out.println();
    }
    public static void main(String args[]){
        int arr[][]={{1,2,3,4},
                    {5,6,7,8},
                    {9,10,11,12},
                    {13,14,15,16}};
        sol(arr);

    }
}
