import java.util.*;
class Solution {
    public int hammingWeight(int n) {
/*        if(n==0){
            return 0;
        }
        ArrayList<Integer> al = new ArrayList<>();
        while(n>1){
            int x=n%2;
            al.add(x);
            n=n/2;
        }
        // int[] arr=new int[al.size()];
        // arr=al.toArray(arr);
        int[] arr = al.stream().mapToInt(Integer::intValue).toArray();

        int count=1;
        for(int i=0; i<arr.length; i++){
            if(arr[i]==1){
                count++;
            }
        }
        return count;
*/


//  run -->  0 ms

int count = 0;
        int mask = 1;

        for(int i=0; i<32; i++){
            if((n&mask) != 0){
                count++;
            }
            mask <<= 1;
        }
        return count;


    }
}
