public class SearchInMount_1095{

    public static void main(String args[]){
        int arr[] = {1,2,5,3,2,1};
        int target = 3;
        System.out.println(search(arr,target));
    }

    public static int search(int arr[], int target){
        int peak = peakIndexInMountainArray(arr);
        int firstTry = orderAgnosticBS(arr, target, 0, peak);
        if(firstTry != -1)
            return firstTry;
        //try to search in second half
        return orderAgnosticBS(arr,target, peak+1, arr.length-1);
    }    
    static int orderAgnosticBS(int[] arr, int target, int start, int end){
        // int start = 0;
        // int end =  arr.length-1;

        boolean isAsc = arr[start] < arr[end];
        // if(arr[end] > arr[start]){
        //     isAsc = true;
        // }
        // else{
        //     isAsc = false;
        // }

        while(start <= end){
            int mid = start + (end - start) / 2;
            
            if(arr[mid] == target){
                return mid;
            }

            if(isAsc){
                if (target < arr[mid]){
                    end = mid - 1;
                }
                else {
                    start = mid + 1;
                }
            }
            else {
                if (target > arr[mid]){
                    end = mid - 1;
                }
                else {
                    start = mid + 1;
                }
            }
        }
        //ans not found
        return -1;
    }

    public static int peakIndexInMountainArray(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while(start < end){
            int mid = start + (end - start) / 2;
            if (arr[mid] > arr[mid + 1]){
                end = mid;
            }
            else{
                start = mid + 1;
            }
        }
        return start;
    }
}
