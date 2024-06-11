import java.util.*;

public class Creation_and_searching {
    public static void creation(int arr[][]){
        int m=arr.length;
        int n=arr[0].length;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter "+m*n+"number");
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                arr[i][j]=sc.nextInt();
            }
        }


    }
     public static void printarray(int arr[][]){
        int m=arr.length;
        int n=arr[0].length;
        
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }


    }
    public static void find_max_and_min(int arr[][]){
        int largest=Integer.MIN_VALUE;
        int smallest=Integer.MAX_VALUE;
        int m=arr.length;
        int n=arr[0].length;
        
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                largest=Math.max(largest,arr[i][j]);
                smallest=Math.min(smallest,arr[i][j]);

            }
            
        }
        System.out.println("The largest no is "+largest);
        System.out.println("The smallest no is "+smallest);



    }
    public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    int m=sc.nextInt();
    int n=sc.nextInt();
    int arr[][]=new int[m][n];
    creation(arr);
    printarray(arr);
    find_max_and_min(arr);
    }

}
    
    


