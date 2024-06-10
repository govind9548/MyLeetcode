class Solution {
    public int heightChecker(int[] h) {
        int n = h.length;
        int eHigh[] = h.clone();
        int count = 0;

        Arrays.sort(eHigh);
        for(int i=0; i<n; i++){
            if(h[i] != eHigh[i]){
                count++;
            }
        }
        return count;
    }
}
