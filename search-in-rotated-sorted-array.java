class Solution {
    public int search(int[] nums, int target) {
        int id=0;
        while(id<nums.length){
            if(nums[id]==target)
                return id;
            id++;
        }
        return -1;
        
    }
}

//LEETCODE PROBLEM
//Easy solution Beats 100% || java || 0ms || linear search
