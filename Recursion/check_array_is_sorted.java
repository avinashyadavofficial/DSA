

public class check_array_is_sorted {
    public static boolean checkarray(int arr[],int i){
        if(i==arr.length-1){
            return true;
        }
        if(arr[i]>arr[i+1]){
            return false;
        }
        
        return checkarray(arr, i+1);
        
        
    }
    public static void main(String[] args) {
        int arr[]={1,2,6,4,5};
        System.out.println(checkarray(arr, 0));
    }
    
}
