class Solution {
    public int singleNumber(int[] nums) {
        int temp=0;
        for(int e:nums){
            temp^=e;
        }
        return temp;
    }
}
