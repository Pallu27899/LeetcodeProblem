class Solution {
   public List<String> letterCasePermutation(String s) {
       List<String> res = new ArrayList<>();
       if(s.length() == 0){
           res.add("");
           return res;   
       }
       solvehelp(res, s.toCharArray(), 0, new StringBuilder());
       return res;
   }
   private void solvehelp(List<String> res, char[] arr, int i, StringBuilder sb){
       if(i == arr.length){
           res.add(sb.toString());
       }else if(i < arr.length){
           if(arr[i] >= '0' && arr[i] <= '9'){
               sb.append(arr[i]);
               solvehelp(res, arr, i + 1, sb);
               sb.deleteCharAt(i);
           }else{
               sb.append(Character.toUpperCase(arr[i]));
               solvehelp(res, arr, i + 1, sb);
               sb.deleteCharAt(i);
               sb.append(Character.toLowerCase(arr[i]));
               solvehelp(res, arr, i + 1, sb);
               sb.deleteCharAt(i);
           }
     }
   }
}
   
