class Solution {
    List<List<Integer>> result = new ArrayList<>();
    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
        List<Integer> path = new ArrayList<>();
        path.add(0);
        dfs(graph,0,path);
        return result;
    }
    public void dfs(int[][]graph,int source,List<Integer> path){
        // path.add(source);
        if(source == graph.length-1){
            result.add(new ArrayList<>(path));
            return;
        }
        for(int val:graph[source]){
            path.add(val);
            dfs(graph,val,path);
            path.remove(path.size()-1);
        }
    }
}
