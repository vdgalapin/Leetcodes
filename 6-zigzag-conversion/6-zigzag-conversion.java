class Solution {
    public String convert(String s, int numRows) {
        
        if ((numRows == 1) || (s.length() == 1)) {
            return s;
        }
        
        
        int columns = s.length();
        int rows = numRows;
        
        Character[][] zigzag = new Character[rows][columns];
        
        int counter = 0;
        int columnCounter = 0;
        while(counter < s.length()) {
            
            int rowCounter = 0;
            
            while((rows > rowCounter) && (counter < s.length())) {
                
                zigzag[rowCounter][columnCounter] = s.charAt(counter);
                
                counter += 1;
                rowCounter += 1;                                                
            }
            
            rowCounter -= 1;
            
            while((rowCounter > 0) && (counter < s.length())) {
                
                columnCounter += 1;
                rowCounter -= 1;
                zigzag[rowCounter][columnCounter] = s.charAt(counter);
                
                counter += 1;   
            }
            
            if(counter < s.length()) {
                counter -= 1;
            }
            
            
        }
        String result = "";
    for(int x = 0; x < zigzag.length; x++) {
        for(int y = 0; y < zigzag[x].length; y++) {
            if (zigzag[x][y] != null) {
                result += zigzag[x][y];
                if (result.length() == s.length()) {
                    return result;
                }
            }
        }
     
    }
    
        return result;
    }
}