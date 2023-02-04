package dp;

class GasStation {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int ans = 0;
        int curr = 0;
        int total = 0;
        for (int i = 0; i < gas.length; i++) {
            curr += (gas[i] - cost[i]);
            if (curr < 0) {
                curr = 0;
                ans = i + 1;
            }
            total += (gas[i] - cost[i]);
        }

        return total < 0 ? -1 : ans;
    }
}
