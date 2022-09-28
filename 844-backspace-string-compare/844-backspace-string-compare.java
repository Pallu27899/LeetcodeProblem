class Solution {
    public boolean backspaceCompare(String s, String t) {
      int i = s.length() - 1, j = t.length() - 1, p;
    while (true) {
        p = 0;
        while (i >= 0 && (p > 0 || s.charAt(i) == '#')) {
            p += s.charAt(i) == '#' ? 1 : -1;
            i--;
        }
        p = 0;
        while (j >= 0 && (p > 0 || t.charAt(j) == '#')) {
            p += t.charAt(j) == '#' ? 1 : -1;
            j--;
        }
        if (i >= 0 && j >= 0 && s.charAt(i) == t.charAt(j)) {
            i--;
            j--;
        } else {
            break;
        }
    }
    return i == -1 && j == -1;
    }
}