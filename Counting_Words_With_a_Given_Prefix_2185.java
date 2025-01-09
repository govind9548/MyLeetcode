class Solution {
    public int prefixCount(String[] words, String pref) {
        int count = 0;
        int lenp = pref.length();
        for(String word: words){
            if(word.length() >= lenp){
                if(word.substring(0, lenp).equals(pref)){
                    count++;
                }
            }
        }
        return count;
    }
}
