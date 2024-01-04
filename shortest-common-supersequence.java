class Solution {
    public String shortestCommonSupersequence(String str1, String str2) {
        char[] char1 = str1.toCharArray();
        char[] char2 = str2.toCharArray();

        int n=str1.length();
        int m=str2.length();

        int[][] dp = new int[n + 1][m + 1];
        for (int i = n - 1; i >= 0; i--) {
            for (int j = m - 1; j >= 0; j--) {
                if (char1[i] == char2[j]) dp[i][j] = dp[i + 1][j + 1] + 1;
                else dp[i][j] = Math.max(dp[i + 1][j], dp[i][j + 1]);
            }
        }
        StringBuilder sb = new StringBuilder();
        int i=0, j=0;
        while(i<n && j<m){
            if(char1[i]==char2[j]){
                sb.append(char1[i]); 
                i++;
                j++;
            }else if(dp[i][j]==dp[i+1][j]){
                sb.append(char1[i]); 
                i++;
            }else{
                sb.append(char2[j]); 
                j++;
            }
        }
        while(i<n){
            sb.append(char1[i]); 
            i++;
        } 
        while(j<m){
            sb.append(char2[j]); 
            j++;
        }   
        return sb.toString();
    }
}
