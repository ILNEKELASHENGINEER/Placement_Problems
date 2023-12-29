class Solution {
    public boolean isGoodArray(int[] nums) {
        int res = calgcd(nums);
        return res==1;
    }
    public static int calgcd(int[] num){
        if(num.length==0)
            return 0;
        int result = num[0];
        for(int i:num){
            result = gcd(result,i);
        }
        return result;
    }
    public static int gcd(int a,int b){
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;

    }
}
