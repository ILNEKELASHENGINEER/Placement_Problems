class Solution {
    public int minInsertions(String s) {
        int n = s.length();
        int[][] dp = new int[n+1][n+1];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                dp[i][j]=-1;
            }
        }
        int i=0;
        int j=n-1;
        int pali = lps(i,j,s,dp);
        return n-pali;
    }
    public static int lps(int i,int j,String s,int[][] dp){
        if(i>j){
            return 0;
        }
        if(i==j){
            return 1;
        }
        if(dp[i][j]!=-1)
        return dp[i][j];

        if(s.charAt(i)==s.charAt(j)){
            return dp[i][j] = 2+lps(i+1,j-1,s,dp);
        }
        int a = lps(i,j-1,s,dp);
        int b = lps(i+1,j,s,dp);
        dp[i][j] = Math.max(a,b);
        return dp[i][j];
    }
}

//here the approach is similar to longest palindrome subsequence 
//here we want to find lps because if we find the longest palindrome so the remaining is the number of character we need to change/insert
//so the ans will be total length - lps(value)
