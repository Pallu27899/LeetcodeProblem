class Solution {
    public int rob(int[] nums) {
        int n = 0;
        int p = 0;
        for (int i = 0; i < nums.length; i ++) {
            int newN = p + nums[i];
            int newP = Math.max(p, n);
            n = newN;
            p = newP;
        }
        return Math.max(n, p);
    }
}