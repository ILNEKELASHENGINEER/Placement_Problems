class Solution {
    public int[] singleNumber(int[] nums) {
        int temp = 0;
        for(int num:nums){
            temp^=num;
        }
        int pos = 0;
        while(temp!=0){
            if(temp%2!=0){
                break;
            }
            temp/=2;
            pos++;
        }
        int res[] = new int[2];
        for(int i:nums){
            if((i&1<<pos)>0){
                res[0]^=i;
            }
            else
            res[1]^=i;
        }
        return res;
    }
}
