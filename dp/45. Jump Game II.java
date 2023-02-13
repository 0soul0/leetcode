package dp;

//45. Jump Game II
//https://leetcode.com/problems/jump-game-ii/description/
class Solution {
    public int jump(int[] nums) {
        if (nums.length <= 1)
            return 0;
        int res = 0;
        int maxPath = 0;
        int goPath = 1;
        for (int i = 0; i < nums.length - 1; i++) {
            goPath--;
            maxPath = Math.max(nums[i], maxPath - 1);
            if (goPath == 0) {
                goPath = maxPath;
                res++;
            }
        }
        return res;
    }
}
