package greedy;

import java.util.Arrays;

// 1657. Determine if Two Strings Are Close
public class loseStrings1657 {

    public static void main(String[] args) {
        System.out.println(closeStrings("abc", "bca")); // true
    }

    public static boolean closeStrings(String word1, String word2) {

        if (word1.length() != word2.length())
            return false;

        int[] num1 = new int[26];
        int[] num2 = new int[26];

        for (char c1 : word1.toCharArray()) {
            num1[c1 - 'a']++;
        }

        for (char c2 : word2.toCharArray()) {
            num2[c2 - 'a']++;
        }

        for (int i = 0; i < 26; i++) {
            if (num1[i] == 0 && num2[i] != 0)
                return false;
            if (num1[i] != 0 && num2[i] == 0)
                return false;
        }

        Arrays.sort(num1);
        Arrays.sort(num2);
        return Arrays.equals(num1, num2);

    }

}