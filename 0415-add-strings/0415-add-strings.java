class Solution {
    public String addStrings(String num1, String num2) {
        String res="";
        int c=0;
        int i=num1.length()-1;
        int j=num2.length()-1;
        while(i>=0 || j>=0 ||c!=0){
            int iVal=i>=0 ? num1.charAt(i)-'0':0;
            int jVal=j>=0 ? num2.charAt(j)-'0':0;
            i--;
            j--;
            
            int sum=iVal+jVal+c;
            res=(sum%10)+res;
            c=sum/10;
       
       }
         return res;
  }
}