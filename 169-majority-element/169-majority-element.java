class Solution {
    public int majorityElement(int[] nums) {
        int result = nums[0];
        int count = 1;
    
        for (int i = 0;  i<nums.length; i++) {
            int N = nums[i];
            if (result == N) ++count;
            else --count;
        
            if (count == 0) {
                result = N;
                count = 1;
            }
        }
    
        return result;
    }
}  