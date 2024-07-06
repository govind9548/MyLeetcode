class Solution {
    public int passThePillow(int n, int time) {
        int cycleLen = 2*(n-1);
        int t = time%cycleLen;

        if(t<n){
            return t+1;
        }else{
            return (n-(t-(n-1)));
        }
        
    }
}
