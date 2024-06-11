public class rotatedsearch {
    public static int search(int[] arr, int target, int start, int end) {
        while (start <= end) {
            int mid = start + (end - start) / 2;
            
            if (arr[mid] == target) {
                return mid;
            }

            // if (arr[start] <= arr[mid]) {
                if (arr[start] <= target && target <= arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            // } else {
            //     if (arr[mid + 1] <= target && target <= arr[end]) {
            //         start = mid + 1;
            //     } else {
            //         end = mid - 1;
            //     }
            // }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {4, 5, 6, 7, 0, 1, 2};
        int target = 0;
        int result = search(arr, target, 0, arr.length - 1);
        System.out.println(result);
    }
}
