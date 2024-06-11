

public class merge_sort {
    public static void mergesort(int arr[],int s, int e){
        if(s>=e){
            return;
        }
        int mid=s+(e-s)/2;
        mergesort(arr, s, mid); //left part
        mergesort(arr, mid+1, e);//right part
        merge(arr,s,mid,e);
         

    }
    public static void merge(int arr[],int s,int mid, int e){
        //left(0,3)=4 right(4,6)=3 >4+3=7 or(e-s+1)=6-0+1=7
        int temp[]=new int[e-s+1];
        int i=s;
        int j=mid+1;
        int k=0;
        while(i<=mid && j<=e){
            if(arr[i]<arr[j]){
                temp[k]=arr[i];
                i++;
            }
            else{
                temp[k]=arr[j];
                j++;
            }
            k++;
        }
        //bache hue elements ke liye
        //left part me
        while(i<=mid){
            temp[k++]=arr[i++];
        }
        while(j<=e){
            temp[k++]=arr[j++];
        }
        //copy temp to original
        for(k=0,i=s;k<temp.length;k++,i++){
            arr[i]=temp[k];

        }
    }
    public static void printarray(int arr[]){
        
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int arr[]={6,3,9,5,2,8};
        mergesort(arr,0,arr.length-1);
        printarray(arr);
        
    }
    
}
