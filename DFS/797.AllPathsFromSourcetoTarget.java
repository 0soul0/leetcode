package DFS;

import java.util.ArrayList;
import java.util.List;

// 797. All Paths From Source to Target
// https://leetcode.com/problems/all-paths-from-source-to-target/description/
class AllPathsFromSourcetoTarget {

    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        list.add(0);
        dfs(graph, res, list, 0);
        return res;
    }

    private void dfs(int[][] graph, List<List<Integer>> res, List<Integer> list, int pos) {
        if (pos == graph.length - 1) {
            res.add(new ArrayList<>(list));
        } else {
            for (int d : graph[pos]) {
                list.add(d);
                dfs(graph, res, list, d);
                list.remove(list.size() - 1);
            }
        }
    }
}
