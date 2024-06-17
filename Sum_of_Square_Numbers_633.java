class Solution {
    public boolean judgeSquareSum(int c) {
        if(c==0){
            return true;
        }
        long x=0;
        long y=(long)Math.sqrt(c);

        while(x<=y){
            if((x*x) + (y*y)==c){
                return true;
            }
            else{
                if((x*x) + (y*y)>c){
                    y--;
                }else{
                    x++;
                }
            }
        }
        return false;
    }
}


