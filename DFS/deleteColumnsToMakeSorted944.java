package DFS;

// 944. Delete Columns to Make Sorted
// https://leetcode.com/problems/delete-columns-to-make-sorted/description/
public class deleteColumnsToMakeSorted944 {
    public int minDeletionSize(String[] strs) {
        int count = 0;
        for (int i = 0; i < strs[0].length(); i++) {
            int prev = -1;
            for (int j = 0; j < strs.length; j++) {
                int curr = strs[j].charAt(i) - 'a';
                if (curr < prev) {
                    count++;
                    break;
                } else {
                    prev = curr;
                }
            }
        }
        return count;
    }

}
