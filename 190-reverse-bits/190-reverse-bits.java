public class Solution {
    // you need treat n as an unsigned value
    public int reverseBits(int n) {
       int result = 0;
        int mask = 1;
        for (int i = 0; i < 32; i ++) {
            int digit = n & mask;
            result = (result << 1);
            if (digit != 0) {
                 result = result + 1;
            }
            mask = (mask << 1);
        }
        return result;
    }
}