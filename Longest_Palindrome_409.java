class Solution {
    public int longestPalindrome(String s) {
        HashMap <Character, Integer> freqMap = new HashMap<Character, Integer>();
        char arrStr[] = s.toCharArray();
        int count = 0;
        boolean oddOccurred = false;

        for(char c : arrStr){
            if(freqMap.containsKey(c)){
                freqMap.put(c, freqMap.get(c)+1);
            }else{
                freqMap.put(c, 1);
            }
        }
        for (Map.Entry<Character, Integer> entry : freqMap.entrySet()) {
            int value = entry.getValue();
            if( value % 2 == 0){
                count += value;
            }else{
                count += value-1;
                oddOccurred = true;
            }
        }
        if(oddOccurred){
            count+=1;
        }
        return count;
    }
}
