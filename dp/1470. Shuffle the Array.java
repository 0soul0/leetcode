package dp;

//1470. Shuffle the Array
//https://leetcode.com/problems/shuffle-the-array/description/
class Solution {
    public int[] shuffle(int[] nums, int n) {

        int[] ans = new int[n * 2];
        int s = 0;
        int e = n;
        for (int i = 0; i < nums.length; i++) {
            ans[i] = nums[i % 2 == 0 ? s++ : e++];
        }

        return ans;
    }
}