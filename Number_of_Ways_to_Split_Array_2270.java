class Solution {
    public int waysToSplitArray(int[] nums) {
        long arrSum = 0;
        long prefixSum = nums[0];
        long remSum = 0;
        int count=0;
        for(int i=0; i<nums.length; i++){
            arrSum += nums[i];
        }
        //  System.out.println(arrSum);
         for(int i=1; i<nums.length; i++){
             remSum = arrSum-prefixSum;
             if(prefixSum >= remSum){
                 count++;
             }
             prefixSum += nums[i];
            //  System.out.println(prefixSum);
         }
        //  System.out.println(count);
        return count;
    }
}
