class Solution {
    public boolean isValid(String s) {
        
        Stack<Character> stack = new Stack<Character>();
        
        for(char x: s.toCharArray()) {
            if(x == '(' ) {
                stack.push(')');
            } else if (x == '[') {
                stack.push(']');
            } else if (x == '{') {
                stack.push('}');
            } else if(stack.isEmpty() || x != stack.pop()) {
                return false;
            }
        }
        
        return stack.isEmpty();
        
    }
}