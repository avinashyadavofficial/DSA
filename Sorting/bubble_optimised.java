import java.util.*;
public class bubble_optimised {
    public static void sorting(int arr[]){
        int size=arr.length-1;
        for(int i=0;i<size;i++){
            boolean swapped=false;
            for(int j=0;j<size-i;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    swapped=true;
                }
            }
            if(swapped==false){
                break;
            }
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
