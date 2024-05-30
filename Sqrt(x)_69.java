class Solution {
    public int mySqrt(int n) {
        if(n==0 || n==1){
            return n;
        }
        long s = 1;
        long e = n;
        long ans=0;

        while(s<=e){
            long mid = s+(e-s)/2;

            if(mid*mid == n){
                return (int) mid;
            }else if(mid*mid < n){
                s=mid+1;
                ans = mid;
            }else{
                e=mid-1;

            }
        }
        return (int) ans;
    }
}
