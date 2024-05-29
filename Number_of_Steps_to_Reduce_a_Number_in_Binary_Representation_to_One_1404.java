class Solution {
    public int numSteps(String s) {
        int count = 0;
        int carry = 0; // Used to handle the addition when the number is odd

        // Start from the end of the string (least significant bit)
        for (int i = s.length() - 1; i > 0; i--) {
            // Current bit value considering the carry
            int bit = s.charAt(i) - '0' + carry;

            if (bit % 2 == 0) {
                // If even, divide by 2 (i.e., shift right)
                count++;
            } else {
                // If odd, we need to add 1 (and handle the carry)
                carry = 1;
                count += 2; // One for the addition and one for the division
            }
        }

        // Handle the most significant bit and any remaining carry
        return count + carry;
    }
}
