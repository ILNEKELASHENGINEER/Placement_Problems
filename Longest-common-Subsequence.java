// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
class HelloWorld {
    static int dp[][] = new int[100][100];
    static int lcs(int m,int n,String text1,String text2) {
        if(m == 0 || n == 0) {
            dp[m][n] = 0;
        }
        if(dp[m][n] != -1) return dp[m][n];
        if(text1.charAt(m-1) == text2.charAt(n-1)) {
            dp[m][n] = 1+lcs(m-1,n-1,text1,text2);
            return dp[m][n];
        }
        int a = lcs(m-1,n,text1,text2);
        int b = lcs(m,n-1,text1,text2);
        dp[m][n] = Math.max(a,b);
        return dp[m][n];
    }
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    String text1 = sc.next();
	    String text2 = sc.next();
	    int m = text1.length();
	    int n = text2.length();
	    for(int i=0;i<=m;i++) {
	        for(int j=0;j<=n;j++){
	             dp[i][j] = -1;
	        }
	    }
	    int length = lcs(m,n,text1,text2);
	    int i=m,j=n;
	    String res = "";
	    while (i> 0 && j > 0) {
	        if(text1.charAt(i-1) == text2.charAt(j-1)) {
	            res = text1.charAt(i-1)+res;
	            i--;
	            j--;
	        }
	        else if(dp[i-1][j] > dp[i][j-1]) {
	            i--;
	        }
	        else {
	            j--;
	        }
	    }
	    System.out.println(res);
	    
	}
}
