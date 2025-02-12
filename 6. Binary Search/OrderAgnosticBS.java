public class OrderAgnosticBS {
    public static void main(String[] args) {
        int[] arr = {89,45,32,27,18,5,0,-1,-8,-17};
        int num = 5;
        int ans = orderAgnosticBS(arr, num);
        System.out.println(ans);
    }

    static int orderAgnosticBS(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        // find whether the array is sorted in ascending or descending.
        boolean isAsc = arr[start] < arr[end];

        while(start <= end) {
            // find the middle element
            // int mid = (start + end) / 2; // might be possible that (start + end) exceeds the range of int in java
            int mid = start + (end - start) / 2;

            if(arr[mid] == target) {
                return mid;
            }
            
            if(isAsc){
                if(target < arr[mid]) {
                    end = mid - 1;
                }
                else {
                    start = mid + 1;
                }
            }
            else{
                if(target > arr[mid]) {
                    end = mid - 1;
                }
                else {
                    start = mid + 1;
                }
            }
        }
        return -1; 
    }
}
