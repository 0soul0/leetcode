package dp;

//806. Number of Lines To Write String
public class numberOfLinesToWriteString806 {
    public static void main(String[] args) {

    }

    public int[] numberOfLines(int[] widths, String s) {
        int[] ans = new int[2];

        int sum = 0;

        for (int i = 0; i < s.length(); i++) {
            sum += widths[s.charAt(i) - 'a'];
            if (sum > 100) {
                sum = widths[s.charAt(i) - 'a'];
                ans[0]++;
            }
        }
        ans[0]++;
        ans[1] = sum;
        return ans;
    }
}
