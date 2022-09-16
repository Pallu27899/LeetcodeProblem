class Solution {
    public int[] sortedSquares(int[] nums) {
     int n = nums.length;
    int[] res = new int[n];
    int index = n - 1;
    int l = 0, r = n - 1;
    while (l <= r) {
        if (Math.abs(nums[l]) < Math.abs(nums[r])) {
            res[index--] = nums[r] * nums[r];
            r--;
        } else {
            res[index--] = nums[l] * nums[l];
            l++;
        }
    }
    return res;
        
    }
}