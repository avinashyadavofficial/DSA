public class firstoccurence {
    public static int firstoccurenceofElement(int arr[], int i, int key){
        if(i==arr.length-1){
            return -1;
        }
        if(arr[i]==key){
            return i;
        }
        return firstoccurenceofElement(arr, i+1, key);


    }
    public static void main(String[] args) {
        int key=5;
        int i=0;
        int arr[]={1,2,4,5,6,7,5,8};
        int ans=firstoccurenceofElement(arr, i, key);
        if(ans==-1){
            System.out.println("No element found");
        }
        else{
            System.out.println(ans);
        }
        
    }
    
}
