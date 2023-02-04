package dp;

//https://leetcode.com/problems/longest-mountain-in-array/description/
//845. Longest Mountain in Array
class LongestMountainInArray {
    public int longestMountain(int[] arr) {
        int res = 0;
        int path = 1;
        Boolean up = true;
        for (int i = 1; i < arr.length; i++) {

            if (up && arr[i - 1] < arr[i]) {
                path++;
                continue;
            }

            if (arr[i - 1] > arr[i]) {
                if (path == 1)
                    continue;
                up = false;
                path++;
                continue;
            }

            if (!up)
                res = Math.max(res, path);

            path = 2;
            if (arr[i - 1] == arr[i])
                path = 1;
            up = true;

        }

        if (!up)
            res = Math.max(res, path);
        return res > 1 ? res : 0;

    }
}
