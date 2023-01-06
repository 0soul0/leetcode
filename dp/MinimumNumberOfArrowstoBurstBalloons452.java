package dp;

import java.util.Arrays;

// 452. Minimum Number of Arrows to Burst Balloonsz
// https://leetcode.com/problems/minimum-number-of-arrows-to-burst-balloons/description/
public class MinimumNumberOfArrowstoBurstBalloons452 {

    public int findMinArrowShots(int[][] points) {
        if (points.length == 0)
            return 0;
        Arrays.sort(points, (a, b) -> Integer.compare(a[1], b[1]));

        int res = 1;
        int end = points[0][1];

        for (int[] point : points) {

            if (point[0] > end) {
                res++;
                end = point[1];
            }
        }
        return res;
    }
}
