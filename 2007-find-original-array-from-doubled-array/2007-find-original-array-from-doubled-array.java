class Solution {
    public int[] findOriginalArray(int[] changed) {
        int n= changed.length;
        if(n%2 !=0){
            return new int[0];
        }
        int[] ans=new int[n/2];
        int[] count =new int[100001];
        for( int i:changed){
            count[i]++;
        }
        int index=0;
        for(int i=0;i<100001;i++){
            while(count[i]>0 && i*2 <100001 && count[i*2]>0){
                count[i]--;
                count[i*2]--;
                ans[index]=i;
                index++;
            }
        }
        for(int i=0;i<100001;i++){
            if(count[i]!=0){
                return new int[0];
            }
        }
    return ans;
    }
}