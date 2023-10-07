//reverse string leetcode problem
// # Intuition
// <!-- Describe your first thoughts on how to solve this problem. -->
// Easy java solution

// # Approach
// <!-- Describe your approach to solving the problem. -->
// Simple inplace element swapping using temp variable

// # Complexity
// - Time complexity:
// <!-- Add your time complexity here, e.g. $$O(n)$$ -->

// - Space complexity:
// <!-- Add your space complexity here, e.g. $$O(n)$$ -->

// # Code

class Solution {
    public void reverseString(char[] s) {
        int start = 0;
        int end = s.length-1;
        while(start<end){
            char temp = s[start];
            s[start]=s[end];
            s[end]=temp;
            start++;
            end--;
        }
        System.out.print(s);
        
    }
}
