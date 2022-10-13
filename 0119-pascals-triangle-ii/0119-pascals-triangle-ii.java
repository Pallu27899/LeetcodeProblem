class Solution {
    public List<Integer> getRow(int RIndex) {
        
        List<Integer>res = new ArrayList<>();
        if(RIndex<0) return res;
        res.add(1);
        for(int i=1;i<=RIndex;i++){
            for(int j=res.size()-1;j>0;j--){
                res.set(j,res.get(j)+res.get(j-1));
            }
            res.add(1);
        }
        return res;
    }
}