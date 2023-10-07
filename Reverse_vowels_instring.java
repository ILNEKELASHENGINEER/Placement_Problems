// # Intuition
// <!-- Describe your first thoughts on how to solve this problem. -->
// Straight forward idea

// # Approach
// <!-- Describe your approach to solving the problem. -->
// simple idea own approach

// # Complexity
// - Time complexity:
// <!-- Add your time complexity here, e.g. $$O(n)$$ -->

// - Space complexity:
// <!-- Add your space complexity here, e.g. $$O(n)$$ -->

// # Code
// ```
class Solution {
    public String reverseVowels(String s) {
        int start = 0;
        char []s1 = s.toCharArray();
        int end = s1.length-1;
        while(start<end){
            char temp = Character.toLowerCase(s1[start]);
            char temp2 = Character.toLowerCase(s1[end]);
            if((temp=='a'||temp=='e'||temp=='i'||temp=='o'||temp=='u')&&
            (temp2=='a'||temp2=='e'||temp2=='i'||temp2=='o'||temp2=='u')){
                char tem = s1[start];
                s1[start] = s1[end];
                s1[end] = tem;
                start++;
                 end--;
            }
            else if((temp=='a'||temp=='e'||temp=='i'||temp=='o'||temp=='u')){
                end--;
            }
            else{
                start++;
            }
            
           
            }
            return new String(s1);
    }
}
