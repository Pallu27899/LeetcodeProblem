//{ Driver Code Starts
#include<bits/stdc++.h>
using namespace std;


// } Driver Code Ends

class Solution
{
  public:
    string newIPAdd (string S)
    {
         
        string r="";
        int n=S.size();
        for(int i=0;i<n;i++){
            string t="";
            while(i<n && S[i]=='0')i++;
            while(i<n && S[i]!='.') t+=S[i++];
            if(t.size()==0)t='0';
            r+=i<n ? t+'.': t;
            
        }
        return r;
    }
};
//{ Driver Code Starts.
int main()
{
    int t; cin >> t;
    while (t--)
    {
        string s; cin >> s;
        Solution ob;
        cout <<ob.newIPAdd (s) << endl;
    }
}


// } Driver Code Ends