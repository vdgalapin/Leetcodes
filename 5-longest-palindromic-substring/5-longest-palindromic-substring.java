class Solution {
    public String longestPalindrome(String s) {
        
        String result = "";
        for(int x = 0; x < s.length(); x++) {
            int left = x, right = x;
            while(left >= 0 && right <= s.length() - 1) {
                if(s.charAt(left) != s.charAt(right)) {
                    break;
                } 
                if(result.length() < s.substring(left, right+1).length()) {
                    result = s.substring(left, right+1);
                }                          
                left--;
                right++;
            }
            
            left = x;
            right = x + 1;
            while(left >= 0 && right <= s.length() - 1) {
                if(s.charAt(left) != s.charAt(right)) {
                    break;
                } 
                if(result.length() < s.substring(left, right+1).length()) {
                    result = s.substring(left, right+1);
                }                         
                left--;
                right++;
            }
        }
        
        return result;
        
    }
}