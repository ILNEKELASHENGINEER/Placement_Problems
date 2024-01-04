class Solution {
    public int longestPalindromeSubseq(String s) {
        int n = s.length();
        int[][] dp = new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                dp[i][j] = -1;
            }
        }
        int i=0;
        int j=n-1;
        return lps(i,j,s,dp);
    }
    public static int lps(int i,int j,String s,int[][]dp){
        if(i>j)
        return 0;
        if(i==j)
        return 1;
        if(dp[i][j]!=-1)
        return dp[i][j];
        if(s.charAt(i)==s.charAt(j))
        return dp[i][j] = 2+lps(i+1,j-1,s,dp);
        int a = lps(i+1,j,s,dp);
        int b = lps(i,j-1,s,dp);
        dp[i][j] = Math.max(a,b);
        return dp[i][j];
    }

}


// Here is an Approach

// 1. Initialize a 2D array dp of size n x n, where n is the length of the input string s.
// 2. Fill the entire dp array with -1 to indicate that no subproblem has been solved yet.
// 3. Define a recursive helper method that takes parameters i and j, which represent the starting and ending indices of the substring to consider in s, and s itself as input.
// 4. In the helper method, implement the following base cases:
//    a. If i > j, return 0 as an empty string is a palindrome with length 0.
//    b. If i == j, return 1 as a single character is a palindrome with length 1.
// 5. Check if the result for the subproblem with indices i and j is already computed and stored in dp[i][j]. If so, return the stored result.
// 6. If the characters at indices i and j in s are the same, recursively call the helper method with i + 1 and j - 1, and add 2 to the result, as the characters at i and j can form a palindrome subsequence of length 2. Store the result in dp[i][j].
// 7. If the characters at indices i and j in s are not the same, take the maximum of the results obtained by excluding either the character at i or the character at j. Recursively call the helper method with i + 1 and j to exclude the character at i, and with i and j - 1 to exclude the character at j. Store the result in dp[i][j].
// 8. Finally, return the result stored in dp[i][j], which represents the length of the longest palindrome subsequence of s starting from indices i and j.
