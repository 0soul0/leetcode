package dp;

// 953. Verifying an Alien Dictionary
// https://leetcode.com/problems/verifying-an-alien-dictionary/description/
public class VerifyingAnAlienDictionary953 {
    public boolean isAlienSorted(String[] words, String order) {
        if (words.length == 1)
            return true;
        for (int i = 1; i < words.length; i++) {
            if (!isSorted(words[i - 1], words[i], order)) {
                return false;
            }
        }
        return true;
    }

    public boolean isSorted(String word1, String word2, String order) {

        for (int i = 0; i < word1.length(); i++) {
            if (i >= word2.length())
                return false;
            int w1 = order.indexOf(word1.charAt(i));
            int w2 = order.indexOf(word2.charAt(i));
            if (w1 > w2) {
                return false;
            } else if (w2 > w1) {
                return true;
            }
        }
        return true;
    }
}
