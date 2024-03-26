import java.util.*;
public class customerWealth_1672{
    public static void main(String[] args){
    int accounts[][] = {{1,2,3},{1,2,3}};
    System.out.println(maximumWealth(accounts));
    }

    public static int maximumWealth(int[][] accounts) {
        int ans = Integer.MIN_VALUE;
        for(int person = 0; person<accounts.length; person++){
            int sum = 0;
            for(int account = 0; account<accounts[person].length; account++){
                sum += accounts[person][account];
            }
            if(sum>ans){
                ans=sum;
            }
        }
        return ans;
    }
}