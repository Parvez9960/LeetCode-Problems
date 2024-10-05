//442. Find All Duplicates in an Array
//https://leetcode.com/problems/find-all-duplicates-in-an-array/description/

import java.util.*;
public class findAllDuplicates_442 {
    public static void main(String[] args) {
        int nums[] = {4,3,2,7,8,2,3,1};
        findAllDuplicates_442 duplicate = new findAllDuplicates_442();
        System.out.println(duplicate.findDuplicates(nums));
    }
    
    public List<Integer> findDuplicates(int[] nums) {
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
        List<Integer> duplicates = new ArrayList<>();
        for(int index = 0; index < nums.length; index++){
            if(nums[index] != index + 1){
                duplicates.add(nums[index]);
            }
        }
        return duplicates;
    }

    public  void swap(int arr[], int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}