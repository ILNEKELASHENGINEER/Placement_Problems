class Solution {
    public List<String> buildArray(int[] target, int n) {
        var res = new ArrayList<String>();
        int i=0;
        for(int j = 1;j<=target[target.length-1];j++){
            res.add("Push");
            if(j!=target[i])
            res.add("Pop");
            else
            i++;
        }
        return res;
    }
}
