class Solution {
    public int trailingZeroes(int n) {
        // int num = n;
        // int den = 5;
        // int ans = 0;
        // while(num>=den){
        //     ans = ans+num/den;
        //     den*=5;
        // }
        // return ans;
        int count = 0;
        while(n>=5){
            n=n/5;
            count+=n;
        }
        return count;
    }
}
