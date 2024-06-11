import java.util.*;
public class diagonalsum {
    public  static int sol(int arr[][]){
        int sum=0;
        for(int i=0;i<arr.length;i++){
            //primarydiagonal
            sum=sum+arr[i][i];
            //secondary diagonal
            if(i!=arr.length-1-i){
                sum=sum+arr[i][arr.length-1-i];

            }
            


        }
        return sum;
    }    
    public static void main(String args[]){
        int arr[][]={{1,2,3,4},
                    {5,6,7,8},
                    {9,10,11,12},
                    {13,14,15,16}};
        System.out.println(sol(arr));

    }
    
}
