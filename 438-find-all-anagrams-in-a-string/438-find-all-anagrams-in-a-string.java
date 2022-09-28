class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> rst = new ArrayList<>();
        if (s == null || s.length() == 0 || s.length() < p.length()) return rst;
        int n = s.length(), m = p.length();
        int[] w = new int[26], cp = new int[26];
        for (int i = 0; i < m; i++) {
            w[s.charAt(i) - 'a']++;
            cp[p.charAt(i) - 'a']++;
        }
        if (compare(w, cp)) rst.add(0);
        for (int i = m; i < n; i++) {
            w[s.charAt(i) - 'a']++;
            w[s.charAt(i - m) - 'a']--;
            if (compare(w, cp)) rst.add(i - m + 1);
        }
        return rst;
    }
    private boolean compare(int[] w, int[] cp) {
        for (int i = 0; i < 26; i++) {
            if (w[i] != cp[i]) return false;
        }
        return true;
    }
}
