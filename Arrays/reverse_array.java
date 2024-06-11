import java.util.*;

public class reverse_array {
    public static void sol(int arr[]){
        int s=0,e=arr.length-1;
        
        while(s<e){
            int temp=arr[s];
            arr[s]=arr[e];
            arr[e]=temp;
            s++;
            e--;
        }
    }
    public static void main(String args[]){
        int arr[]={50,60,70};
        
        sol(arr);
        for(int i=0;i<arr.length;i++){
                System.out.print(arr[i]+" ");
    
        }
       
        }
    
}
