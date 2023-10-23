class Solution(object):
    def majorityElement(self, nums):
        li={}
        for i in nums:
            if i in li:
                li[i]+=1
            else:
                li[i]=1
        for i in li:
            if li[i]>len(nums)/2:
                return i
#leetcode problem
        
