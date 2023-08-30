class Solution {
    public int removeElement(int[] nums, int val) {
        int len = nums.length;
        int j =0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=val){
                nums[j]=nums[i];
                j++;
            }
        }
        return j;
      //i just try with linkedlist but i took all duplicates ;)
        // LinkedList<Integer> sets = new LinkedList<>() ;
        // for(int i=0;i<len;i++){
        //     if(nums[i]!=val){
        //         sets.add(nums[i]);
        //     }
        // }
        // return sets.size();
    }
}
