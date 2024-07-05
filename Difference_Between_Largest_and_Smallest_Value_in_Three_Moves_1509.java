import java.util.*;
class Solution {
    public int minDifference(int[] arr) {
        Arrays.sort(arr);
        int n = arr.length;
        if(n<=3){
            return 0;
        }

        int diff1 = arr[n-1]-arr[3];
        int diff2 = arr[n-4]-arr[0];
        int diff3 = arr[n-2]-arr[2];
        int diff4 = arr[n-3]-arr[1];

        return Math.min(Math.min(diff1,diff2), Math.min(diff3, diff4));
    }
}
