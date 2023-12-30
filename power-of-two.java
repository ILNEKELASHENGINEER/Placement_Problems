class Solution {
    public boolean isPowerOfTwo(int n) {
        for(int i=0;i<32;i++){
            if(n==(1<<i)&&n>0)
                return true;
        }
        return false;
    }
}
