class Solution {
    public int characterReplacement(String s, int k) {
    if(s == null || s.length() == 0){
    return 0;
}
    int max = 0;
    int[] ch = new int[26];
    char[] str = s.toCharArray();
    for(int i=0, j=0; i<s.length(); i++){
        while(j < s.length()){
            ch[str[j] - 'A']++;
            if(count(ch) > k){  
                ch[str[j] - 'A']--;
                break;
            }
            j++;
        }
        max = Math.max(max, j-i);
        ch[str[i] - 'A']--;
    }
    return max;
    }

    public int count(int[] ch){
    int max = 0;
    int sum = 0;
    for(int val:ch){
        sum += val;
        max = Math.max(max, val);
    }
    return sum - max;
}
}