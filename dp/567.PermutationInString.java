package dp;

//567. Permutation in String
//https://leetcode.com/problems/permutation-in-string/description/
class permutationInString {
    public boolean checkInclusion(String s1, String s2) {

        if (s2.length() < s1.length())
            return false;

        int[] arr = new int[26];
        int[] arr2 = new int[26];
        for (int i = 0; i < s1.length(); i++) {
            arr[s1.charAt(i) - 'a']++;
        }

        for (int i = 0; i < s2.length(); i++) {

            if (i >= s1.length()) {
                arr2[s2.charAt(i - s1.length()) - 'a']--;
            }
            arr2[s2.charAt(i) - 'a']++;
            if (ArrayEquals(arr, arr2))
                return true;

        }

        return false;
    }

    public boolean ArrayEquals(int[] arr1, int[] arr2) {

        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr2[i])
                return false;
        }
        return true;

    }
}
