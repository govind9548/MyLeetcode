class Solution {
    public int minSteps(int n) {
        int steps = 0;
        int factor = 2;
        if(n==1){
            return 0;
        }

        while(n>1){
            while(n%factor == 0){
                steps+=factor;
                n/=factor;
            }
            factor+=1;
        }
        return steps;
    }
}
