class Solution {
    public int removeDuplicates(int[] nums) {
        
        
        int length = nums.length;
        if (length == 1) {
            return 1;
        }
        
        int result = length;
        int start = 0;
        int index = start + 1;
        while(start < length && index < length && result > index) {
            if(nums[start] == nums[index]) {
                result--;
                for(int x = index; x < length-1; x++) {
                    nums[x] = nums[x+1];
                }
            } else {
                start = index;
                index = start + 1;
            }
            
        }
        System.out.println(result);
        return result;
    }
}