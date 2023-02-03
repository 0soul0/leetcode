package dp;

// 6. Zigzag Conversion
//https://leetcode.com/problems/zigzag-conversion/description/
public class zigzagConversion6 {
    public String convert(String s, int numRows) {

        String[] temp = new String[numRows];
        String res = "";
        int r = 0;
        boolean down = true;

        for (int i = 0; i < numRows; i++) {
            temp[i] = "";
        }

        for (int i = 0; i < s.length(); i++) {
            temp[r] += s.charAt(i);
            if (r == numRows - 1) {
                down = false;
            } else if (r == 0) {
                down = true;
            }

            if (down && r != numRows - 1) {
                r++;
            } else if (r != 0) {
                r--;
            }

        }

        for (int i = 0; i < temp.length; i++) {
            res += temp[i];
        }
        return res;

    }
}
