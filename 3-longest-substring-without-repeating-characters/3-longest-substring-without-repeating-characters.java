class Solution {
    public int lengthOfLongestSubstring(String s) {
        
        if(s.length() <= 1 ) return s.length();
        
        String result = "";
        String curr = "";
        int x = 0;
        while(x < s.length()) {          
            if(curr.contains(s.substring(x, x+1))) {
                String first = s.substring(x, x+1);
                int y = x;
                while(true) {
                    if(first.equals(s.substring(y-1, y))) {
                        x = y ;
                        break;
                    } else {
                        y--;
                    }   
                }
                curr = s.substring(x, x+1);
            } else {
                curr += s.substring(x, x+1);
            }
            
            if(curr.length() >= result.length()) {    
                result = curr;  
            }  
           
            x++;
        }
        
        return result.length();
    }
}