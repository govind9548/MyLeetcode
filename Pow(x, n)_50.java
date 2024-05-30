class Solution {
    public double myPow(double x, int n) {

        if(n<0){
            n=-n;
            x=1/x;
        }

        double ans = 1;
        while(n!=0){
            if((n & 1) != 0){
                ans = ans*x;
            }
            x*=x;
            n>>>=1;
        }
        return ans;
    }
}
