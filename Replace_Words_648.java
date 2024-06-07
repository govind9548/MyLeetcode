class Solution {
    public String replaceWords(List<String> dictionary, String sentence) {
        HashSet<String> rootSet = new HashSet<>(dictionary);
        String[] words = sentence.split(" ");
        StringBuilder result = new StringBuilder();

        for(String s: words){
            String prefix = " ";
            for(int i=1; i<=s.length(); i++){
                prefix = s.substring(0,i);
                if(rootSet.contains(prefix)){
                    break;
                }
            }
            if(result.length() > 0){
                result.append(" ");
            }

            result.append(prefix);
        } 
        return result.toString();
    }
}
