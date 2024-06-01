class Solution {
    public int scoreOfString(String s) {
        int count = 0;
        for(int i=0; i<s.length()-1; i++){
            int x = Math.abs((int)s.charAt(i)-(int)s.charAt(i+1));
            count += x;
        }
        return count;
    }
}
