class Solution {
    public String getHint(String secret, String guess) {
        int b = 0;
        int c = 0;
        int[] sec = new int[10];
        int[] gue = new int[10];
        for (int i = 0; i < secret.length(); i ++) {
            if (secret.charAt(i) == guess.charAt(i)) {
                b ++;
            }
            else {
                sec[secret.charAt(i) - '0'] ++;
                gue[guess.charAt(i) - '0'] ++;
            }
        }
        for (int i = 0; i < sec.length; i ++) {
            c += Math.min(sec[i], gue[i]);
        }
        return b + "A" + c + "B";
        }
    }
