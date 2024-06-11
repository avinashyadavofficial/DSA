import java.util.*;

public class binary_search {
    public static int sol(int arr[],int key){
        int s=0;
        int e=arr.length-1;
        int mid=(s+e)/2;
        while(s<=e){
            if(arr[mid]==key){
                return mid;
            }
            else if(key<arr[mid]){
                e=mid-1;
            }
            else{
                s=mid+1;
            }
            mid=(s+e)/2;
        }
        return -1;
    }
    public static void main(String args[]){
        int arr[]={10,80,30,40,50};
        int key=30;
        int ans=sol(arr,key);
        if(ans==-1){
            System.out.println("Key not found");
        }
        else{
            System.out.println("key found at "+ans+" index");
        }

    }
    
}
