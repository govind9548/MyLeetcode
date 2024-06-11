class Solution {
    public int maxArea(int[] h) {
        int area = 0;
        int left = 0;
        int right = h.length-1;

        while(left < right){
            int currHeight = Math.min(h[left], h[right]);
            int currWidth = right - left;
            int currArea =  currHeight * currWidth;

            area = Math.max(area, currArea);

            if(h[left] < h[right]){
                left++;
            }else{
                right--;
            } 
        }
        return area;
    }
}
