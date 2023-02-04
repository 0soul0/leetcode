package DFS;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//https://leetcode.com/problems/combination-sum/description/
//39. Combination Sum
class CombinationSum {
    List<List<Integer>> res = new ArrayList<>();

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        Arrays.sort(candidates);
        helper(0, candidates, target, new ArrayList<Integer>());
        return res;
    }

    private void helper(int index, int[] candidates, int target, List<Integer> list) {
        if (target == 0) {
            res.add(new ArrayList<>(list));
            return;
        }

        for (int i = index; i < candidates.length; i++) {
            if (target - candidates[i] < 0)
                break;
            list.add(candidates[i]);
            helper(i, candidates, target - candidates[i], list);
            list.remove(list.size() - 1);
        }

    }
}
