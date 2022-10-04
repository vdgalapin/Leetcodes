class Solution {
    public int removeElement(int[] nums, int val) {
        
        if(nums.length == 1 && nums[0] != val) return 1;
        int result = 0;
        int pointer = 0;
        int second_pointer = 1;
        while(second_pointer < nums.length) {
     
            int first = nums[pointer];
            int second = nums[second_pointer];
            
            if(first == val && second == val) {
                int third_pointer = second_pointer + 1;
                while(third_pointer <= nums.length) { 
                    if(third_pointer > nums.length - 1) {
                        return result;
                    }
                    int third = nums[third_pointer];
                    if(third == val) {
                        third_pointer++;
                    } else {
                        nums[pointer] = third;
                        nums[third_pointer] = first;
                        pointer++;
                        second_pointer = third_pointer;
                        result++;
                    }
                }
                
            } else if(first == val) {
                nums[pointer] = second;
                nums[second_pointer] = first;
                pointer++;
                second_pointer++;
                result++;
            } else if(second == val){
                pointer++;
                second_pointer++;
                result++;
            } else {
                result += 2;
                pointer += 2;
                second_pointer = pointer + 1;
            }
        }
        
               
            if(second_pointer == nums.length) {
                if(nums[pointer] != val) {
                    result++;
                    return result;
                }
            } 
            return result;
            
       
    }
}