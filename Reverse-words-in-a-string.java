class Solution {
    public String reverseWords(String s) {
        if (s.length()==0)
        return "";
        String res="";
        String arr[] = s.trim().split("\\s+");
        for(int i=arr.length-1;i>0;i--)
        res+=arr[i]+" ";
        return res+arr[0];
    }
}
