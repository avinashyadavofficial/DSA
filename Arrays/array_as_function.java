import java.util.*;

public class array_as_function {
    public static void update(int arr[],int a){
        a =5;
        for(int i=0;i<arr.length;i++){
            arr[i]=arr[i]+1;

        }

    }
    public static void main(String args[]){
    int arr[]={50,60,70};
    int a=10;
    update(arr,a);
    for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");

    }
    System.out.println();
    System.out.println(a); // print 10 as it takes value from main and doesnt get affected by changes in update func
    }

    
}
