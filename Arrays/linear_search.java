import java.util.*;

public class linear_search {
    public static int sol(int arr[],int key){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==key){
                return i;
            }
            
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
