public class Solution {
    public String decodeString(String s) {
        String result = "";
        Stack<Integer> nm = new Stack<Integer>();
        Stack<String> str = new Stack<String>();
        int c = 0;
        for (int i = 0; i < s.length(); ++i) {
            if (s.charAt(i) >= '0' && s.charAt(i) <= '9') {
                c = 10 * c + s.charAt(i) - '0';
            } else if (s.charAt(i) == '[') {
                nm.push(c);
                str.push(result);
                c = 0; result = "";
            } else if (s.charAt(i) == ']') {
                int k = nm.pop();
                String next = str.pop();
                for (int j = 0; j < k; ++j) 
                    next += result;
                result = next; 
            } else {
                result += s.charAt(i);
            }
        }
        return result;
    }
}