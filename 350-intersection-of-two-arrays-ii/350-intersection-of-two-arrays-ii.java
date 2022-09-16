class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        List<Integer> arr=new ArrayList<Integer>();
        HashMap<Integer,Integer> h1 =new HashMap<>();
        HashMap<Integer,Integer> h2 =new HashMap<>();
        
        for(int i=0;i<nums1.length;i++){
            if(h1.containsKey(nums1[i]))
                h1.put(nums1[i],h1.get(nums1[i])+1);
            else
                h1.put(nums1[i],1);
        }
        
         for(int i=0;i<nums2.length;i++){
            if(h2.containsKey(nums2[i]))
                h2.put(nums2[i],h2.get(nums2[i])+1);
            else
                h2.put(nums2[i],1);
        }
        
         for(Integer key : h1.keySet()){
            if(h2.containsKey(key)){
                int x=Math.min(h2.get(key),h1.get(key));
                while(x-- > 0){
                    arr.add(key);
                }
            }
                
        }
        int result[]=new int[arr.size()];
        for(int i=0;i<arr.size();i++)
            result[i]=arr.get(i);
        
        return result;
    
    }
}