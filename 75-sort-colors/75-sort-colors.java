class Solution {
      public void sortColors(int[] nums) {
        int red=0, blue=nums.length-1;
        int i=0;
        while(i<blue+1){
            if(nums[i]==0){
                int res = nums[i];
                nums[i] = nums[red];
                nums[red] = res;
                red++;
                i++;
                continue;
            }
            if(nums[i] ==2){
                int res = nums[i];
                nums[i] = nums[blue];
                nums[blue] = res;
                blue--;
                continue;
            }
            i++;
        }
    }
}