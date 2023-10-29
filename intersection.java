import java.util.*;
class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> seta = new HashSet<>();
        for(int i:nums1){
            seta.add(i);
        }
        Set<Integer> setb = new HashSet<>();
        for(int i:nums2){
            setb.add(i);
        }
        Set<Integer> res = new HashSet<>();
        for(Integer var :seta){
            if(setb.contains(var)){
                res.add(var);
            }
        } 
        int [] arr = new int[res.size()];
        int j=0;
        for(Integer val:res){
            arr[j] = val.intValue();
            j++;
        }
    return arr;
        
    }
}

//LEETCODE PROBLEM
