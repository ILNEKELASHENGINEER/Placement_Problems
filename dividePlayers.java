class Solution {
    public long dividePlayers(int[] skill) {
        long res = 0;
        int len = skill.length;
        Arrays.sort(skill);
        int d = skill[0]+skill[len-1];
        for(int i=0;i<len/2;i++){
            int a = skill[i];
            int b = skill[len-i-1];
            if(a+b!=d) return -1;
            res+=(a*b);
        }
        return res;
        
    }
}
//SORT AND FIND APPROACH
