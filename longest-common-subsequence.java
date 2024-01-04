class Solution {
    public int longestCommonSubsequence(String text1, String text2) {
        int m = text1.length();
        int n = text2.length();
        int[][] dp = new int[m+1][n+1];
        for(int i=0;i<=m;i++){
            for(int j=0;j<=n;j++){
                dp[i][j] = -1;
            }
        }
        return lcs(m,n,text1,text2,dp);
    }
    public static int lcs(int m,int n,String text1, String text2,int[][]dp){
        
             if(m==0 || n==0)
        {
        return 0;
        }
        
        if(dp[m][n]!=-1) return dp[m][n];
   
        if(text1.charAt(m-1)==text2.charAt(n-1))
            return dp[m][n] =  1+lcs(m-1,n-1,text1,text2,dp);

        int a = lcs(m-1,n,text1,text2,dp);
        int b = lcs(m,n-1,text1,text2,dp);
        dp[m][n]= Math.max(a,b);
        return dp[m][n];

    }
    }

//only order matters not index 
