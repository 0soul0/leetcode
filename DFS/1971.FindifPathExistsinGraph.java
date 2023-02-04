package DFS;

import java.util.ArrayList;
import java.util.List;

// https://leetcode.com/problems/find-if-path-exists-in-graph/
// 1971. Find if Path Exists in Graph
class findifPathExistsinGraph {
    public static void main(String[] args) {

    }

    // solution1
    public boolean validPath(int n, int[][] edges, int source, int destination) {
        boolean[] visited = new boolean[n];
        List<Integer>[] graph = new ArrayList[n];

        for (int i = 0; i < n; i++) {
            graph[i] = new ArrayList<>();
        }

        for (int[] edge : edges) {
            graph[edge[0]].add(edge[1]);
            graph[edge[1]].add(edge[0]);
        }

        return hasPath(n, graph, source, destination, visited);
    }

    private boolean hasPath(int n, List<Integer>[] graph, int start, int end, boolean[] visited) {
        if (start == end)
            return true;

        visited[start] = true;

        for (int edge : graph[start]) {
            if (!visited[edge]) {
                boolean newPath = hasPath(n, graph, edge, end, visited);
                if (newPath)
                    return true;
            }
        }
        return false;
    }

    // solution2
    public boolean validPath2(int n, int[][] edges, int source, int destination) {
        boolean[] path = new boolean[n];
        boolean processed = true;
        path[source] = true;
        while (!path[destination] && processed) {
            processed = false;
            for (int[] edge : edges) {
                int a = edge[0];
                int b = edge[1];
                if (path[a] ^ path[b]) {
                    processed = true;
                    path[a] = true;
                    path[b] = true;
                }
            }
        }
        return path[destination];
    }

}
