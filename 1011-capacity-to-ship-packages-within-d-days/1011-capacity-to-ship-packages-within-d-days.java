class Solution {
    public int shipWithinDays(int[] weights, int days) {
     int n=weights.length;
    int sum=0;
    int max=0;
     int p=0;
    for(int i=0;i<n;i++){
        if(weights[i]>max)max=weights[i];
        sum+=weights[i];
        
    }
    int l=max;
    int h=sum;
   
    while(l<=h){
        int m=(l+h)/2;
        if(Fnc(m,weights,days)){
            p=m;
            h=m-1;
            
        }else
            l=m+1;
        
    }
    return p;
}
static boolean Fnc (int m,int weights[],int days){
    int sum=0;
    int d=1;
    for(int i=0;i<weights.length;i++){
        if(sum+weights[i]<=m)sum+=weights[i];
        else{
            sum=weights[i];
            d++;
        }
    }
    if(d<=days) return true;
    return false;
}
}