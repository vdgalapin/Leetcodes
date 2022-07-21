class Solution {
    public int[] plusOne(int[] digits) {
        int idx = digits.length - 1;
        
        // if there is no element
        if(digits.length == 0 ) {
            digits[0] = 1;
            return  digits;
        }
        
        int val = 0;
        do {
            
            // element is add 1
            val = digits[idx] + 1;
            digits[idx] = val % 10;
            idx--;
            
            // If the val is 10 and the idx is not before 0
        } while (val == 10 && idx >= 0);
        
        // if the last value is still 10 then shift to the right by one
        if(val == 10) {
            
            int[] c_digits = Arrays.copyOf(digits, digits.length + 1);
                       digits = c_digits;
          
            
            for(int x = digits.length - 2; x >= 0; x--) {
                digits[x + 1] = digits[x];
            }
            
            digits[0] = 1;
        }
            
        return digits;
    
    }
}