class Solution {
    public int appendCharacters(String s, String t) {
        int count=0;
        int i=0, j=0;
        int sLen = s.length();
        int tLen = t.length();

        while(i<sLen  && j<tLen){
            if(s.charAt(i) == t.charAt(j)){
                j++;
            }
            i++;
        }
        return tLen - j;
    }
}
