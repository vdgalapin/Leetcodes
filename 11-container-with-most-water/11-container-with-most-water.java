class Solution {
    public int maxArea(int[] height) {
        
        int result = 0;
        int left = 0, right = height.length - 1;
        
        while(left < right) {
            int area = Math.min(height[left], height[right]) * (right - left);
            if(result < area) {
                // System.out.println(area);
                result = area;
            }
            // System.out.println("left: " + left + " right:" + right);
            if(height[left] > height[right]) {
                right -= 1;
            } else {
                left ++;
            }
        }
        return result;
        
//         for(int x = 0; x < height.length - 1; x++) {
//             for(int y = x + 1; y < height.length; y++) {
//                 int area = Math.min(height[x], height[y]) * (y-x);  
//                 if(result < area) {
//                     result = area;
//                 }
                
                
//             }
//         }
//         return result;
        
    }
}