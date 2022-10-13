class Solution {
    public int[][] generateMatrix(int n) {
      int t=0, b=n-1, l=0, r=n-1, d=0;
        int[][] mat = new int[n][n];
         int num=1;
        
        while(l<=r && t<=b){
            
            if(d==0){
                for(int i=l; i<=r; i++){
                    mat[t][i]=num;
                    num++;
                }
             d=1;t++;
            }else if(d==1){
                 for(int i=t; i<=b; i++){
                    mat[i][r]=num;
                    num++;
                }
                
              d=2; r--; 
            }else if(d==2){
                 for(int i=r; i>=l; i--){
                    mat[b][i]=num;
                    num++;
                }
                
               d=3; b--;
            }else if(d==3){
                 for(int i=b; i>=t; i--){
                    mat[i][l]=num;
                    num++;
                }
                
               d=0;l++; 
            }
            
            
        }
        return mat;
        
    }
}
          