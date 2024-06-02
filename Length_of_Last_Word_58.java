class Solution {
    public int lengthOfLastWord(String str) {
        String s = str.trim();
        int len = s.length();
        int count = 0;

        for(int i=len-1; i>=0; i--){
                if(s.charAt(i) == ' '){
                    return count;
                }
                count++;
        }
        return count;
    }
}
