class Solution {
    public int hammingDistance(int x, int y) {
        int n = x^y;

        int count = 0;
        int mask = 1;

        for(int i=0; i<32; i++){
            if((n&mask) != 0){
                count++;
            }
            mask <<= 1;
        }
        return count;
    }
}
