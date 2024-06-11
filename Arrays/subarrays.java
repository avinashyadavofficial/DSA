import java.util.*;

public class subarrays {
    public static void sol(int arr[]){
        int largest=Integer.MIN_VALUE;
        int smallest=Integer.MAX_VALUE;
        int total_subarray=0;
        for(int i=0;i<arr.length;i++){
            for(int j=i;j<arr.length;j++){
                int sumofeachsubarray=0;
                for(int k=i;k<=j;k++){
                    sumofeachsubarray=sumofeachsubarray+arr[k];
                    total_subarray++;
                    System.out.print(arr[k]+" ");
                }
                if(largest<sumofeachsubarray){
                    largest=sumofeachsubarray;
                }
                if(smallest>sumofeachsubarray){
                    smallest=sumofeachsubarray;
                }
                System.out.println();
            }
        }
        System.out.println("Total number of subarray is "+total_subarray);
        System.err.println("Maximum sum out of all subarray is "+largest);
        System.out.println("Minimum sum out of all subarray is "+smallest);

    }
    public static void main(String args[]){
        int arr[]={1,-2,6,-1,3};
        sol(arr);
        

        }
    
    
}
