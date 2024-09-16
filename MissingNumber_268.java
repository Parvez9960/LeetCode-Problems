import java.util.*;
//https://leetcode.com/problems/missing-number/
//Amazon Question
public class MissingNumber_268{
    public static void main(String[] args) {
        int[] arr = {3, 5, 2, 1, 4};
        missingNumber(arr);
        System.out.println(Arrays.toString(arr));
    }

    static int missingNumber(int arr[]){
        int i = 0;
        while(i < arr.length){
            int correctInd = arr[i];
            if(arr[i] < arr.length && arr[i] != arr[correctInd]){
                swap(arr, i, correctInd);
            }
            else{
                i++;
            }
        }

        //search for first missing no.
        for(int index = 0; index < arr.length; index++){
            if(arr[index] != index){
                return index;
            }
        }

        //case 2
        return arr.length;
    }

    static void swap(int arr[], int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;

    }
}