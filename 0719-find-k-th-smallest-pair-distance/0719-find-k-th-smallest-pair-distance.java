class Solution {
    public int smallestDistancePair(int[] nums, int k) {
      int len = nums.length;
        int size = len * (len - 1) / 2;
        int[] arr = new int[1000000];
        for(int i = 0; i < len; i++){
            for(int j = i + 1; j < len; j++){
                arr[Math.abs(nums[i] - nums[j])]++;
            }
        }
        int cur = 0;
        while(k > 0){
            k -= arr[cur++];
        }
        return cur - 1;
    }
}