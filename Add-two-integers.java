class Solution {
    public int sum(int num1, int num2) {
        int carry = num2;
        while(carry!=0){
            int temp = num1;
            num1 = num1^carry;
            carry = (carry&temp)<<1;
        }
        return num1;
    }
}
