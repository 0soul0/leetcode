package dp;

//https://leetcode.com/problems/flip-string-to-monotone-increasing/description/
//926. Flip String to Monotone Increasing
class FlipStringToMonotoneIncreasing {
    public int minFlipsMonoIncr(String s) {
        int zeroCount = 0;
        int oneCount = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '0') {
                zeroCount++;
            }
        }
        int ans = s.length() - zeroCount;

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '0') {
                zeroCount--;
            } else if (c == '1') {
                ans = Math.min(oneCount + zeroCount, ans);
                oneCount++;
            }

        }
        return ans;
    }
}
