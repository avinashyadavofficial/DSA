import java.util.*;

public class largest_number {
    public static int largest(int arr[]){
        int ans=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(ans<arr[i]){
                ans=arr[i];
            }
        }
        return ans;
    }
    public static void main(String args[]){
        int arr[]={3,5,7,34,1,10};
        System.out.println(largest(arr));
    }

    
}
