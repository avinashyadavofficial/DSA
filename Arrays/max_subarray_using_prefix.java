import java.util.*;

public class max_subarray_using_prefix{
    public static void sol(int arr[]){
        int largest=Integer.MIN_VALUE;
        int smallest=Integer.MAX_VALUE;
        int sumofeachsubarray=0;
        int prefix[]=new int[arr.length];
        prefix[0]=arr[0];
        for(int i=1;i<prefix.length;i++){
            prefix[i]=prefix[i-1]+arr[i];
        }
       
        for(int start=0;start<arr.length;start++){
            for(int end=start;end<arr.length;end++){
                
                sumofeachsubarray=start==0?prefix[end]:prefix[end]-prefix[start-1];
                if(largest<sumofeachsubarray){
                    largest=sumofeachsubarray;
                }
                if(smallest>sumofeachsubarray){
                    smallest=sumofeachsubarray;
                }
                System.out.println();
            }
        }
        
        System.err.println("Maximum sum out of all subarray is "+largest);
        System.out.println("Minimum sum out of all subarray is "+smallest);

    }
    public static void main(String args[]){
        int arr[]={1,-2,6,-1,3};
        sol(arr);
        

        }
    
    
}
