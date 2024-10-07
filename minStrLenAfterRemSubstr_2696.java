import java.util.*;
//2696. Minimum String Length After Removing Substrings
//https://leetcode.com/problems/minimum-string-length-after-removing-substrings/description/?envType=daily-question&envId=2024-10-07

class minStrLenAfterRemSubstr_2696 {
    public static void main(String args[]){
        String s = "ABFCACDB";
        System.out.println(minLength(s));
    }

    public static int minLength(String s) {
        Stack <Character> stack = new Stack<>();
        for(int i = 0; i < s.length(); i++){
            char curr_char = s.charAt(i);
            if(stack.isEmpty()){
                stack.push(curr_char);
                continue;
            }
            if(curr_char == 'B' && stack.peek() == 'A'){
                stack.pop();
            }
            else if(curr_char == 'D' && stack.peek() == 'C'){
                stack.pop();
            }
            else{
                stack.push(curr_char);
            }
        }
        return stack.size();
    }
}