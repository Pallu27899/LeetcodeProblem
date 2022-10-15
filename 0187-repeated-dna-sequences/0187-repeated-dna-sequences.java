class Solution {
   public List<String> findRepeatedDnaSequences(String s) {
    Set<String> first = new HashSet<>(), repeat = new HashSet<>();
        int len = s.length();
        for(int i = 0; i <= len - 10; i++){
            String sub = s.substring(i, i + 10);
            if(!first.add(sub)) repeat.add(sub);
        }
        return new ArrayList<String>(repeat);
    }
}