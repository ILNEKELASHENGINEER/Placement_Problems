class Solution {
    public static void rev(int nums[],int s,int e){
        while(s<e){
            int temp = nums[e];
            nums[e]=nums[s];
            nums[s]=temp;
            s++;
            e--;
        }
    }
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        if(k>n){
            k = k%n;
            
        }
        rev(nums,0,n-k-1);
        rev(nums,n-k,n-1);
        rev(nums,0,n-1);  
    }
}
