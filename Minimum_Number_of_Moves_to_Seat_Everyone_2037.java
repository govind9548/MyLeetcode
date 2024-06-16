import java.util.*;
class Solution {
    public int minMovesToSeat(int[] seats, int[] students) {
        int n=students.length;
        int i=0;
        int moves=0;
        Arrays.sort(students);
        Arrays.sort(seats);
        while(i<n){
            moves=moves + (Math.abs(seats[i]-students[i]));
            i++;
        }
        return moves;
    }
}
