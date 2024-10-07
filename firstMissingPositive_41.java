import java.util.*;

class firstMissingPositive_41 {
    public static void main(String args[]){
        int nums[] = {3,4,-1,1};
        firstMissingPositive_41 fstMissNo = new firstMissingPositive_41();
        System.out.println(fstMissNo.firstMissingPositive(nums));
    }

    public int firstMissingPositive(int[] nums) {
        int i = 0;
        while (i < nums.length) {
            int correctIndex = nums[i] - 1;
            if(nums[i] > 0 && nums[i] != nums[correctIndex] && nums[i] <= nums.length) {
                swap(nums, i, correctIndex);
            }
            else{
                i++;
            }
        }
        for(int index = 0; index < nums.length; index++){
            if(nums[index] != index + 1){
                return index + 1;
            }
        }
        return nums.length + 1;
    }

    public static void swap(int nums[], int first, int second){
        int temp = nums[first];
        nums[first] = nums[second];
        nums[second] = temp;
    }
}