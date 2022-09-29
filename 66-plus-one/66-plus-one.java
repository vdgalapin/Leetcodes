class Solution {
    public int[] plusOne(int[] digits) {
        
        int length = digits.length;
        
        for(int x = length - 1; x >= 0; x--) {
            
            if(digits[x] <  9) {
                digits[x]++;
                return digits;
            }
            
            digits[x] = 0;
            
        }
        
        int[] result = new int[length+1];
        result[0] = 1;
        
        return result;
//         if(digits.length == 1) {
//             if(digits[0] == 9) {
//                 int[] instant_result = new int[2];
//                 instant_result[0] = 1;
//                 instant_result[1] = 0;
//                 return instant_result;
//             } else {
//                 digits[0] = digits[0] + 1;
//                 return digits;
//             }
//         }
        
//         int plus = 1;
//         for(int x = digits.length - 1; x > 0; x--) {
//             if(digits[x] == 9 && plus == 1) {               
//                 digits[x] = (digits[x] + plus) % 10;
//                 plus = 1;
//             } else {
//                 digits[x] = digits[x] + plus;
//                 plus = 0;
//             }
//         }
      
//         if(plus == 1) {
//             if(digits[0] == 9) {
//                 int[] result = new int[digits.length + 1];
//                 result[0] = 1;
//                 result[1] = 0;
//                 for(int x = 2; x < result.length; x++) {
//                     result[x] = digits[x-1];
//                 }
//                 return result;
//             } else {
//                 digits[0] = digits[0] + 1;
//                 return digits;
//             }
//         } else {
//             return digits;
//         }   
    }
}