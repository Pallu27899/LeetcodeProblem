class Solution {
    public boolean increasingTriplet(int[] nums) {
        // Tc=O(n) ,SC=O(1)
        int first =Integer.MAX_VALUE, second =Integer.MAX_VALUE;
        for(int n:nums){
            if(n<=first){
                first=n;
            }else if(n<=second){
                second=n;
            }else{
                return true;
            }
            
        }
        return false;
    }
}