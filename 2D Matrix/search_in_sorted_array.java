import java.util.*;
public class search_in_sorted_array {
    public static void sol(int arr[][],int key){
        int row=0,col=arr[0].length-1;
        int a=0;
        while(row<=arr.length-1 && col>=0){
            if(arr[row][col]==key){                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                      
                System.out.println("Key found at ["+row+","+col+"]");
                a=a+1;
                break;

            }
            else if(key<arr[row][col]){
                col--;

            }
            else{
                row++;
            }

        }
        if(a==0)
        System.out.println("Not found");


        
    }
    public static void main(String args[]){
        int arr[][]={{10,20,30,40},
                    {15,25,35,45},
                    {27,29,37,48},
                    {32,33,39,50}};
        int key=50;
        sol(arr,key);
        

    }
    
}
