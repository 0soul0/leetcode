package dp;

import java.util.List;

//1443. Minimum Time to Collect All Apples in a Tree
//https://leetcode.com/problems/minimum-time-to-collect-all-apples-in-a-tree/description/
public class minimumTimeToCollectAllApplesInATree {

    public int minTime(int n, int[][] edges, List<Boolean> hasApple) {
        int[] pathCount = new int[n];
        for (int i = edges.length - 1; i >= 0; i--) {
            int[] temp = edges[i];
            if (hasApple.get(temp[1]) || pathCount[temp[1]] != 0) {
                pathCount[temp[0]] += 2 + pathCount[temp[1]];
            }
            if (hasApple.get(temp[0]) || pathCount[temp[0]] != 0) {
                pathCount[temp[1]] += 2 + pathCount[temp[0]];
            }
        }
        return pathCount[0];
    }
}
