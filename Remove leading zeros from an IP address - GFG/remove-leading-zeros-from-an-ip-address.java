//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

public class GfG
{
    public static void main(String args[])
        {
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();
            while(t-->0)
                {
                    String s = sc.next();
                    Solution ob = new Solution();
                    System.out.println(ob.newIPAdd(s));
                }
        }
}
// } Driver Code Ends


//User function Template for Java

class Solution
{
    public String newIPAdd(String S)
    {
    String r="";
        int n=S.length();
        for(int i=0;i<n;i++){
            String t="";
            while(i<n && S.charAt(i)=='0')i++;
            while(i<n && S.charAt(i)!='.') t+=S.charAt(i++);
            if(t.length()==0)t ="0";
            r+=i<n ? t+'.': t;
            
        }
        return r;
    }
    
}