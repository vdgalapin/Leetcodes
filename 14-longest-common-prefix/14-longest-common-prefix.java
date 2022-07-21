class Solution {
    public String longestCommonPrefix(String[] strs) {
        
        String longest_string = "";
        
        // Iterate characters of the first element
        for(int x = 0; x < strs[0].length(); x++) {
            
            char felem_c = strs[0].charAt(x);
            
            // Check each each element
            for(int y = 1; y < strs.length; y++) {
                
                // If the longest string length found is equal or greater 
                //to the lenght of the current string then return it
                if(longest_string.length() >= strs[y].length() || x >= strs[y].length()) {
                    return longest_string;
                }
                
                if(felem_c != strs[y].charAt(x)) {
                    return longest_string;
                }
                
                
                    
            }
            
            longest_string += Character.toString(felem_c);
            
        }
        
        return longest_string;
        
    }
}