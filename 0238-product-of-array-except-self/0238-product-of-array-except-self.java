class Solution {
    public int[] productExceptSelf(int[] nums) {
    int n=nums.length;
        int [] res=new int [n];
        int BeforeCur=1;
        int AfterCur=1;
        
        for(int i=0;i<n;i++){
            res[i]=BeforeCur;
            BeforeCur*=nums[i];
        }
        for(int i=n-1;i>=0;i--){
            res[i]*=AfterCur;
            AfterCur*=nums[i];
        }
        return res;
    }
}