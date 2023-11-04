//LEETCODE 912 MEDIUM
class Solution {
    public int[] sortArray(int[] nums) {
        // divide and conquer follows recursive function  
        divide(nums,0,nums.length-1);
        return nums;
    }
    public void divide(int[]nums,int low,int high){
        if(low<high){
        int mid = (high-low)/2+low;
        divide(nums,low,mid);
        divide(nums,mid+1,high);
        merge(nums,low,mid,high);
        }
    }
    public void merge(int[] nums,int low,int mid,int high){
        int temp[] = new int[high-low+1];
        int i = low;
        int j = mid+1;
        int ind = 0;
        while(i<=mid && j<=high){
            if(nums[i]<=nums[j]){
                temp[ind] = nums[i];
                i++;
                ind++;
            }
            else{
                temp[ind++] = nums[j++];
            }
        }
        //adding remaining elements to the array which was not compared
        while(i<=mid){
            temp[ind++] = nums[i++];
        }
        while(j<=high){
            temp[ind++] = nums[j++];
        }
        int index=0;
        for(int k = low;k<=high;k++){
            nums[k] = temp[index++];
        }
    }
}
