class Solution {
    public boolean isPowerOfTwo(int n) {
        if(n==0){
            return false;
        }

        // while(n%2 == 0){
        //     n /= 2;
        // }
        // return n==1;

        long x = (long)n;
        // return (x & (-x))==x;
        return (x & (x-1))==0;     // ex = (16 & 15) == 0
    }
}
