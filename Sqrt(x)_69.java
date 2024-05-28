class Solution {
    public int mySqrt(int n) {
        if(n==0 || n==1){
            return n;
        }
        int s = 1;
        int e = n;
        int ans=0;

        while(s<=e){
            int mid = s+(e-s)/2;

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
