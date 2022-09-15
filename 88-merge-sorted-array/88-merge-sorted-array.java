class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
     int last = m+n-1;
        int f = m -1;
        int s = n -1;

        while(s >= 0){
            if(f >=0){
                nums1[last--] = nums1[f] > nums2[s] ? nums1[f--] : nums2[s--];
            }else{
                nums1[last--] = nums2[s--];
            }
        }

    }
}