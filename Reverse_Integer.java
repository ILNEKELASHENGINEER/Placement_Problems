//Leetcode medium problem
class Solution {
    public int reverse(int x) {
        long rev = 0, y =x;
        while(y!=0){
            rev = rev*10 + y%10;
            y = y/10;
            if(rev>Integer.MAX_VALUE) return 0;
            if(rev<Integer.MIN_VALUE) return 0;
        }
        return (int)rev;
    }
}
