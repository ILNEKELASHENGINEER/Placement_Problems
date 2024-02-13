class Solution {
    public boolean validPath(int n, int[][] edges, int start, int end) {

        /************ Building graph Start ***************/

        ArrayList<Integer>[] graph = new ArrayList[n];
        for (int i = 0; i < n; i++) {
            graph[i] = new ArrayList<>();
        }
        for (int[] edge : edges) {
            graph[edge[0]].add(edge[1]);
            graph[edge[1]].add(edge[0]);
        }

        /************ Building graph End ***************/

        boolean[] visited = new boolean[n];
        Stack<Integer> stack = new Stack<Integer>();
        stack.add(start);
        visited[start] = true;
        while (!stack.isEmpty()) {
            int current = stack.pop();
            if (current == end)
                return true;
            for (int neighbor : graph[current]) {
                if (!visited[neighbor]) {
                    visited[neighbor] = true;
                    stack.add(neighbor);
                }
            }
        }
        return false;
    }
}
