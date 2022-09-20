class Solution {
    public String addBinary(String a, String b) {
        
        int l1 = a.length() - 1;
        int l2 = b.length() - 1;
        
        StringBuilder result = new StringBuilder();
        int carry = 0;
        while(l1 >= 0 && l2 >= 0) {       
            
            System.out.println(l1 + ":" + a.charAt(l1));
            System.out.println(l2 + ":" + b.charAt(l2));
            if(a.charAt(l1) == '1') {
                if(b.charAt(l2) == '1') {
                    
                    if (carry == 1) {
                        carry = 1;
                        result.append('1');
                    } else {
                        carry = 1;
                        result.append('0');
                    }
                    
                } else {
                    
                    if (carry == 1) {
                        carry = 1;
                        result.append('0');
                    } else {
                        carry = 0;
                        result.append('1');
                    }
                }
            } else {
                if(b.charAt(l2) == '1') {
                    
                    if (carry == 1) {
                        carry = 1;
                        result.append('0');
                    } else {
                        carry = 0;
                        result.append('1');
                    }
                    
                } else {
                  if (carry == 1) {
                        carry = 0;
                        result.append('1');
                    } else {
                        carry = 0;
                        result.append('0');
                    }   
                }
            }
            
            l1--;
            l2--;
            System.out.println(result);
            System.out.println("");
            
        }
        
    
         if(l1 >= 0) {
             for(int x = l1; l1 >= 0; l1--) {
                 if(a.charAt(l1) == '1') {
                     if (carry == 1) {
                         carry = 1;
                         result.append('0');
                     } else {
                         carry = 0;
                         result.append('1');
                     }
                 } else {
                     if (carry == 1) {
                         carry = 0;
                         result.append('1');
                     } else {
                         carry = 0;
                         result.append('0');
                     }
                 }
             } 
        }
            
            
            
         if(l2 >= 0) {
             for(int x = l2; l2 >= 0; l2--) {
                 if(b.charAt(l2) == '1') {
                     if (carry == 1) {
                         carry = 1;
                         result.append('0');
                     } else {
                         carry = 0;
                         result.append('1');
                     }
                 } else {
                     if (carry == 1) {
                         carry = 0;
                         result.append('1');
                     } else {
                         carry = 0;
                         result.append('0');
                     }
                 }
             } 
        }
        
        if (carry == 1) {
            result.append('1');
        }
        
        
        return String.valueOf(result.reverse());
    }
}