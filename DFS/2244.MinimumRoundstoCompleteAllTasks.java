package DFS;

import java.util.Arrays;

// https://leetcode.com/problems/minimum-rounds-to-complete-all-tasks/description/
// 2244. Minimum Rounds to Complete All Tasks
class MinimumRoundstoCompleteAllTasks {
    public int minimumRounds(int[] tasks) {

        int ans = 0;
        Arrays.sort(tasks);
        int task = tasks[0];
        int sum = 1;
        for (int i = 1; i < tasks.length + 1; i++) {
            if (i < tasks.length && task == tasks[i]) {
                sum++;
            } else {
                if (sum == 1)
                    return -1;
                ans += (sum / 3);
                if (sum % 3 != 0) {
                    ans++;
                }
                if (i < tasks.length) {
                    sum = 1;
                    task = tasks[i];
                }
            }
        }
        return ans;
    }
}
