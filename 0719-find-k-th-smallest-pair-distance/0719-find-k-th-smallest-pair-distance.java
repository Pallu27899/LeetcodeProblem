class Solution {
    public int smallestDistancePair(int[] nums, int k) {
      Arrays.sort(nums);
        int len = nums.length;
        int left = 0, right = nums[nums.length - 1];
        while(left <= right){
            int mid = left + (right - left) / 2;
            int j = 0;
            int count = 0;
            for(int i = 0; i < len; i++){
                while(j < len && nums[j] - nums[i] <= mid) ++j;
                count += j - i - 1;
            }
            if(count >= k) right = mid - 1;
            else left = mid + 1;
        }
        return left;
    }
}