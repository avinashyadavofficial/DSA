public class rotated_search {
    public static int search(int arr[],int tar,int s,int e){
        //base
        if(s>e){
            return -1;
        }
        int mid=s+(e-s)/2;
        //case 1:
        if(arr[mid]==tar){
            return mid;
        }
        //case 2... L1
        if(arr[s]<=arr[mid]){
            //case a:
            if(arr[s]<=tar && tar<=arr[mid]){
                return search(arr, tar, s, mid-1);
            }
            else{
                return search(arr, tar, mid+1, e);
            }
        }
        //case 3... L2
        else{
            //case d:
            if(arr[mid+1]<=tar && tar<=arr[e]){
                return search(arr, tar, mid+1, e);
            }
            else{
                return search(arr, tar, s,mid-1);
            }

        }

    }
    public static void main(String[] args) {
        int arr[]={4,5,6,7,0,1,2};
        int tar=0;
        int ans=search(arr, tar, 0, arr.length-1);
        System.out.println(ans);
        
    }
    
}


