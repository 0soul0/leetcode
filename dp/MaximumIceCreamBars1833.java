package dp;

import java.util.Arrays;

//1833. Maximum Ice Cream Bars
//https://leetcode.com/problems/maximum-ice-cream-bars/description/
public class MaximumIceCreamBars1833 {
    public int maxIceCream(int[] costs, int coins) {
        int maxCost = 0;

        for (int cost : costs) {
            if (cost > maxCost) {
                maxCost = cost;
            }
        }

        int[] numOfCosts = new int[maxCost + 1];

        for (int cost : costs) {
            numOfCosts[cost]++;
        }

        int iceCreamBars = 0;

        for (int cost = 1; cost <= maxCost; cost++) {
            if (numOfCosts[cost] == 0) {
                continue;
            }

            if (coins < cost) {
                break;
            }

            int count = Math.min(numOfCosts[cost], coins / cost);
            coins -= count * cost;
            iceCreamBars += count;
        }

        return iceCreamBars;

    }

    private int solution1(int[] costs, int coins) {
        int ans = 0;
        Arrays.sort(costs);
        for (int cost : costs) {
            coins -= cost;
            if (coins >= 0) {
                ans++;
                continue;
            }
            break;
        }
        return ans;
    }
}
