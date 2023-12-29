class Solution {
    public int largestCombination(int[] nums) {
        int bits[] = new int[32];
        for(int n:nums){
            for(int j=0;j<32&& n!=0;j++){
                if((n & 1<<j)!=0){
                    bits[j]+=1;
                }
            }
        }
    int res = 0;
    for(int each:bits){
        res = Math.max(res,each);
    }
    return res;
    }
}
