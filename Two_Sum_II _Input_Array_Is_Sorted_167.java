class Solution {
    public int[] twoSum(int[] nums, int target) {
        Arrays.sort(nums);
        // int ans[] = new int[2];
        for(int i=0; i<nums.length-1;i++){
            for(int j=i+1; i<nums.length; j++){
                if(nums[i]+nums[j]==target){
                    int ans[] = {i+1,j+1};
                    return ans;
                }
            }
        }
        return null;
    }
}
