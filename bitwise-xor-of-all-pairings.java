class Solution {
    public int xorAllNums(int[] nums1, int[] nums2) {
       int size1 = nums1.length;
       int size2 = nums2.length;
       if(size1%2==0 && size2%2==0){
           return 0;
       }
       if(size1%2==0){
           return xor(nums1);
       }
       if(size2%2==0){
           return xor(nums2);
       }
       return xor(nums1)^xor(nums2);
    
    }
    public int xor(int[]arr){
        int temp=0;
        for(int each:arr){
            temp^=each;
        }
        return temp;
    }
}
