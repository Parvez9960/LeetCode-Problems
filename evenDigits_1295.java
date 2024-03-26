import java.util.*;

public class evenDigits_1295 {
    public static void main(String[] args) {
        int nums[] = {12,345,2,6,7896};
        System.out.println(findNumbers(nums));
    }

    public static int findNumbers(int[] nums) {
        int count = 0;
        for(int num : nums){
            if(even(num)){
                count++;
            }
        }
        return count;
    }

    static boolean even(int num){
        int numofDigits = digits(num);
        return numofDigits % 2 ==0;
        /*
        if(numofDigits % 2 == 0){
            return true;
        }
        else{
            return false;
        }
         */
    }

    static int digits(int num){
        if(num < 0){
            num = num * -1;
        }
        // if(num == 0){
        //     return 1;
        // }
        // int count = 0;
        // while(num > 0){
        //     count++;
        //     num = num/10;
        // }
        // return count;
        return (int)(Math.log10(num))+1;
    }
}