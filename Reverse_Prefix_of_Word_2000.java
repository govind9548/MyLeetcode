class Solution {
    public String reversePrefix(String word, char ch) {
        char[] charArr = word.toCharArray();
        int start=0;
        int end=-1;
        for(int i=0; i<word.length(); i++){
            if(charArr[i]==ch){
                 end=i;
                 break;
            }
        }

        while(start<end){
            char temp=charArr[start];
            charArr[start]=charArr[end];
            charArr[end]=temp;
            start++;
            end--;
        }
        return new String(charArr);
    }
}
