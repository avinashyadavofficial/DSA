import java.util.*;
public class selection {
    public static void sorting(int arr[]){
        for(int i=0;i<arr.length-2;i++){
            int minpos=i;
            for(int j=i+1;j<arr.length-1;j++){
                if(arr[minpos]>arr[j]){
                    minpos=j;
                }

            }
            int temp=arr[minpos];
            arr[minpos]=arr[i];
            arr[i]=temp;

        }
    }
   
    public static void main(String args[]){
        int arr[]={3,5,2,7,8};
        sorting(arr);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    
}
