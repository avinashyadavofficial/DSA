public class lastoccurence {
    public static int lastoccurenceofElement(int arr[], int i, int key){
        if(i==0){
            return -1;
        }
        if(arr[i]==key){
            return i;
        }
        return lastoccurenceofElement(arr, i-1, key);


    }
    public static int othermethod(int arr[],int i,int key){
        if(i==arr.length){
            return -1;
        }
        int found=othermethod(arr, i+1, key);
        if(found==-1 && arr[i]==key){
            return i;
        }
        return found;
    }

    public static void main(String[] args) {
        int key=5;
        
        int arr[]={1,2,4,5,6,7,5,8};
        int i=arr.length-1;
        int ans=lastoccurenceofElement(arr, i, key);
        if(ans==-1){
            System.out.println("No element found");
        }
        else{
            System.out.println(ans);
        }

        //othermethod
        System.out.println(othermethod(arr, 0, key));
        
    }
    
}
