class Solution {
    public int romanToInt(String s) {
        HashMap<Character, Integer> roman = new HashMap<Character, Integer>();
        roman.put('I', 1);
        roman.put('V', 5);
        roman.put('X', 10);
        roman.put('L', 50);
        roman.put('C', 100);
        roman.put('D', 500);
        roman.put('M', 1000);
        
        if(s.length() == 1) return roman.get(s.charAt(0));
        
        int result = 0;
        
        int x = 0;
        while(x < s.length() - 1) {
            
            if(roman.get(s.charAt(x)) < roman.get(s.charAt(x+1))) {
                
                result += roman.get(s.charAt(x+1)) - roman.get(s.charAt(x));
                x += 2;
                
            } else {
                
                result += roman.get(s.charAt(x));
                x++;
                
            }
            
        
                      
        }
        
        if(x == s.length() - 1 ) {
            
            result += roman.get(s.charAt(x));
        }
  
        
        return result;
        
    }
}