import java.util.*;
class Solution {
    public static int superEggDrop(int k, int n) {
        int[][] dp = new int[n + 1][k + 1];
        
        int m = 0;  
        while (dp[m][k] < n) {
            m++;
            for (int j = 1; j <= k; j++) {
                dp[m][j] = dp[m - 1][j - 1] + dp[m - 1][j] + 1;
            }
        }
        
    return m;



    // time limit exceeded for 3,26

    // public int superEggDrop(int e, int f) {
    //     if(f==0 || f==1){
    //         return f;
    //     }
    //     if(e==1){
    //         return f;
    //     }

    //     int min = Integer.MAX_VALUE;
    //     for(int k=1; k<=f; k++){
    //         int temp = 1+Math.max(superEggDrop(e-1,k-1), superEggDrop(e, f-k));
    //         min = Math.min(min, temp);
    //     }
    //     return min;
    }
}
