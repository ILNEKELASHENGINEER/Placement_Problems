class Solution {
    public int singleNumber(int[] nums) {
        int bits[] = new int[32];
        for(int i:nums){
            for(int j=0;j<32&&i!=0;j++){
                if((i&1<<j)!=0){
                    bits[j]+=1;
                }
            }
        }
        int a=0;
        for(int j=0;j<32;j++){
            if(bits[j]%3 == 0){
                bits[j] = 0;
            }
            else{
                bits[j] = 1;
            }
            a+=Math.pow(bits[j]*2,j);

        }
        return a;
    }
}
