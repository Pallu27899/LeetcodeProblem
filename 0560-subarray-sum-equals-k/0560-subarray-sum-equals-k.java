class Solution {
    public int subarraySum(int[] nums, int k) {
      int[] s = new int[nums.length + 1];
        int sum = 0;
        for (int i = 0; i < nums.length; i ++) {
            sum += nums[i];
            s[i + 1] = sum;
        }
        int count = 0;
        for (int i = 0; i < nums.length; i ++) {
            int p = s[i];
            for (int j = i; j < nums.length; j ++) {
                int t = s[j + 1] - p;
                if (t == k) {
                    count ++;
                }
            }
        }
        return count;
    }
}