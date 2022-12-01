package dp;

//1704. Determine if String Halves Are Alike
public class halvesAreAlike1704 {

    public static void main(String[] args) {
        System.out.println(halvesAreAlike("book")); // true
        System.out.println(halvesAreAlike("textbook")); // false
        System.out.println(halvesAreAlike("Uo")); // true
    }

    public static boolean halvesAreAlike(String s) {
        return vowelCount(0, s.length() / 2, s) == vowelCount(s.length() / 2, s.length(), s);
    }

    public static int vowelCount(int start, int end, String s) {
        String vowel = "aeiouAEIOU";
        int count = 0;
        for (int i = start; i < end; i++) {
            if (vowel.indexOf(s.charAt(i)) != -1) {
                count++;
            }
        }
        return count;
    }

}
