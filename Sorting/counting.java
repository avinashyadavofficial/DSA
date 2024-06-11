import java.util.*;
public class counting {
    public static void sorting(int arr[]){
        int largest=Integer.MIN_VALUE;
        //Largest nikal lenege
        for(int i=0;i<arr.length;i++){
            largest=Math.max(largest, arr[i]);
        }
        // Count karte sabhi number ko ki kitne kitne baar hai
        int count[]=new int[largest+1];
        for(int i=0;i<arr.length;i++){
            count[arr[i]]++;
        }
        int j=0;
        for(int i=0;i<count.length;i++){
            while(count[i]>0){
                arr[j]=i;
                j++;
                count[i]--;
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
