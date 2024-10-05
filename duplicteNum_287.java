//287. Find the Duplicate Number
//https://leetcode.com/problems/find-the-duplicate-number/description/

import java.util.*;
public class duplicteNum_287 {
    public static void main(String[] args) {
        int nums[] = {1, 3, 4, 2, 2};
        //findDuplicate(nums);
        System.out.println(findDuplicate(nums));
    }
    public static int findDuplicate(int[] nums) {
        int i = 0;
        while(i < nums.length){
            if(nums[i] != i + 1){
                int correctIndex = nums[i] - 1;
                if(nums[i] != nums[correctIndex] ){
                    swap(nums, i, correctIndex);
                }
                else{
                    return nums[i];
                }
            }
            else{
                i++;
            }
        }
        return -1;
    }

    public static void swap(int arr[], int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}