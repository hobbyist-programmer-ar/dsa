package org.hobbiesofar.arrays;

import java.util.Arrays;

class CountIncreasingQuadruplets {
    public long countQuadruplets(int[] nums) {
        int len = nums.length;

        int[][] greaterThanCount = new int [len][len];
        int[][] lessThanCount = new int [len][len];

        for(int j = 1; j < len - 2; j++) {
            int count = 0;
            for(int l = j + 1; l < len; l++) {
                if(nums[j] < nums[l]) {
                    count++;
                }
            }
            for(int k = j+1; k < len - 1; k++) {
                if(nums[j] > nums[k]) {
                    greaterThanCount[j][k] = count;
                } else {
                    count--;
                }
            }
        }

        long quadCount = 0;
        for(int k = 2; k < len - 1; k++) {
            int count = 0;
            for(int i = 0; i < k; i++) {
                if(nums[i] < nums[k]) {
                    count++;
                }
            }
            for(int j = k - 1; j > 0; j--) {
                if(nums[j] > nums[k]) {
                    lessThanCount[j][k] = count;
                    quadCount += (long) greaterThanCount[j][k] * lessThanCount[j][k];
                } else  {
                    count--;
                }
            }
        }
        return quadCount;
    }


    public long countQuadrupletsDP(int[] nums) {
        int n = nums.length;
        long[] dp = new long[n];
        Arrays.fill(dp, 0);
        long ans = 0;
        for(int i = 1; i < n; i++) {
            int choice = 0;
            for(int j = 0; j < i; j++) {
                if(nums[i] > nums[j]) {
                    choice++;
                    ans += dp[j];
                } else if(nums[i] < nums[j]) {
                    dp[j] += choice;
                }
            }
        }
        return ans;
    }
}
