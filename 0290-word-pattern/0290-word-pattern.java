class Solution {
    public boolean wordPattern(String pattern, String s) {
        String[] str = s.split(" "); 
        if (pattern.length() != str.length) {
            return false;
        }
        HashSet<String> set = new HashSet<>();
        HashMap<Character, String> map = new HashMap<>();
        for (int i = 0; i < pattern.length(); i++) {
            char key = pattern.charAt(i);
            String value = str[i];
            if (map.containsKey(key)) {
                if (!map.get(key).equals(value)) {
                    return false;
                }
            } else if (set.contains(value)) {
                return false;
            } else {
                set.add(value);
                map.put(key, value);
            }
        }
        return true;
    }
}