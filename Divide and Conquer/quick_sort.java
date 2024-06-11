public class quick_sort {
    public static void printarray(int arr[]){
        
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void quicksort(int arr[],int s,int e){
        //base
        if(s>=e){
            return;
        }
        
        //last element
        int pindex=partition(arr,s,e);
        quicksort(arr, s, pindex-1);//left
        quicksort(arr, pindex+1, e);//right
 
    }
    public static int partition(int arr[],int s,int e){
        int pivot=arr[e];
        int i=s-1;
        for(int j=s;j<e;j++){
            if(arr[j]<=pivot){
                i++;
                //swap
                int temp=arr[j];
                arr[j]=arr[i];
                arr[i]=temp;
                

            }
        }
        i++;
        int temp=pivot;
        arr[e]=arr[i]; // dont write pivot inplace of arr[e] bcz phir change wo variable hi hoga
        arr[i]=temp;
        return i;

    }

    public static void main(String[] args) {
        int arr[]={6,3,9,5,2,8};
        quicksort(arr,0,arr.length-1);
        printarray(arr);
        
    }
}
