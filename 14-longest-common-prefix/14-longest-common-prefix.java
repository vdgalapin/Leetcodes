class Solution {
    public String longestCommonPrefix(String[] strs) {
        
        if(strs.length <= 1) {return strs[0];}
        
        
        // Lets find the shortest string
        int short_string = 0;
        for(int x = 0; x < strs.length; x++) {
            if(strs[short_string].length() > strs[x].length()) {
                short_string = x;                
            } 
        }
                
        String result = strs[short_string];
        
        // check each element in the list if it contains the shortest string
        for(int x = 0; x < strs.length; x++) {
            
            // if it does not then we will shorten the string
            if(strs[x].indexOf(result) != 0) {
                
                while(true) {
                    
                    result = result.substring(0, result.length() - 1);
                    if(strs[x].indexOf(result) == 0) {
                        break;
                    }
                    
                    if(result.length() == 0 ) return result;
                    
                }
            }
            
        }
        
        return result;
        
    }
}