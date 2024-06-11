public class backtracking_on_arrays {
    public static void arrays(int arr[],int i, int val){
        //base
        if(i==arr.length){
            printarray(arr);
            return;
        }
        //stack me upar jaane ke liye
        arr[i]=val;
        arrays(arr, i+1, val+1);
        //stack me niche aane ke liye
        arr[i]=arr[i]-2;



    }
    public static void printarray(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int n=5;
        int arr[]=new int[n];
        arrays(arr, 0, 1);
        printarray(arr);
        
        
    }
    
}
