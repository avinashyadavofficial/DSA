import java.util.*;

public class kadane_max_subarray {
public static int kadane(int arr[]){
    
    int currentsum=0;
    int maxsum=0;
    int a=0;
    for(int i=0;i<arr.length;i++){
        if(arr[i]>0){
            a=1;
            break;
        }

    }
    if(a==0){
        int sum=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            sum=Math.max(sum,arr[i]);

        }
        return sum;
    }
    else{
    
    for(int i=0;i<arr.length;i++){
        currentsum=currentsum+arr[i];
        if(currentsum<0){
            currentsum=0;
        }
        maxsum=Math.max(currentsum,maxsum);
    }
    return maxsum;
    }
}
public static void main(String args[]){
    int arr[]={-2};
    System.out.println(kadane(arr));
}

    
}
