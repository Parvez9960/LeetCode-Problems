import java.util.*;
public class setMismatch_645{
    public static void main(String[] args) {
        int nums[] = {1,2,2,4};
        setMismatch_645 mismatch = new setMismatch_645();
        // System.out.println(mismatch.findErrorNums(nums));
        System.out.println(Arrays.toString(mismatch.findErrorNums(nums)));
    }

    public int[] findErrorNums(int nums[]){
        int i = 0;
        while(i < nums.length){
            int correctIndex = nums[i] - 1;
            if(nums[i] != nums[correctIndex]){
                swap(nums, i, correctIndex);
            }
            else{
                i++;
            }
        } 
        for(int index = 0; index < nums.length; index++){
            if(nums[index] != index + 1){
                return new int[]{nums[index], index + 1};
            }
        }
        return new int[]{-1, -1};
    }

    public static void swap(int arr[], int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}