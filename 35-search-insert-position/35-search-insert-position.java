class Solution {
    public int searchInsert(int[] nums, int target) {
        int result = 0;
        
        if(nums[0] >= target) return 0;
        if(nums[nums.length-1] < target) return nums.length;
        if(nums[nums.length-1] == target) return nums.length - 1;
        
        for(int x = 0; x < nums.length; x++) {
            if (nums[x] == target) {
                result = x;
                break;
            } else {
                if(target < nums[x]) {
                    result = x;
                    break;
                } 
                
            
            }
        }
        return result;
    }
}