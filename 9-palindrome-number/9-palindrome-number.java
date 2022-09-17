class Solution {
    public boolean isPalindrome(int x) {
        if(x < 0) {
            return false;
        }
        
        String sx = String.valueOf(x);
        int length = sx.length() - 1;
        boolean result = false;
        int start = 0;
        int end = length;
        
        if(sx.length() % 2 == 0) {
            // Even
                    
            while(start <= length / 2 && end >= length / 2 + 1) {
                
                if(sx.charAt(start) != sx.charAt(end)) {
                    return false;
                }
                start += 1;
                end -= 1;
                result = true;
            }
            
        } else {
            // Odd
           
            while(start < length / 2 + 1) {
               
               if(sx.charAt(start) != sx.charAt(end)) {
                    return false;
                }
                
                start += 1;
                end -= 1;
                result = true;
            }
            
        }
        
        return result;
    }
}