class Solution {
    public boolean wordBreak(String s, List<String> wordDict) {
        int n = s.length();
        boolean[] ds = new boolean[n+1];
        ds[n] = true;
        Set<String> dict = new HashSet(wordDict);
        for(int i=n-1;i>=0;i--){
            for(int j=i+1;!ds[i] && j<=n;j++){
                
                    ds[i]=ds[j] & dict.contains(s.substring(i,j));
                
            }
        }
        return ds[0];
        
    }
}


//LEETCODE problem level - medium
