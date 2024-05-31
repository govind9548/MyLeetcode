class Solution {
    public int singleNumber(int[] nums) {
        int ones=0;
        int twos=0;

        for(int num: nums){
            twos = twos|(ones&num);
            ones = ones^num;
            int threes = ones & twos;

            ones = ones&(~threes);
            twos = twos&(~threes);
        }
        return ones;
    }
}
