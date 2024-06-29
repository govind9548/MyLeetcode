class Solution {
    public int romanToInt(String s) {
        HashMap <Character, Integer> romMap = new HashMap<>();
        romMap.put('I',1); 
        romMap.put('V',5); 
        romMap.put('X',10); 
        romMap.put('L',50); 
        romMap.put('C',100); 
        romMap.put('D',500); 
        romMap.put('M',1000); 

        int total=0;
        int len = s.length();

        for(int i=0; i<len; i++){
            int currVal = romMap.get(s.charAt(i));

            if(i<len-1 && currVal<romMap.get(s.charAt(i+1))){
                total-=currVal;
            }else{
                total+=currVal;
            }
        }
        return total;
    }
}
