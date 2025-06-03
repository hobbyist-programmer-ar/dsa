package org.hobbiesofar.slidingwindow;

import java.util.List;

class FixedSubArraySum {
    public static int subarraySumFixed(List<Integer> nums, int k) {
        // WRITE YOUR BRILLIANT CODE HERE
        int windowSum = 0;
        for(int i = 0; i < k; i++) {
            windowSum += nums.get(i);
        }
        int maxSum = windowSum;
        for(int right = k; right < nums.size(); right++) {
            int left = right - k;
            windowSum -= nums.get(left);
            windowSum += nums.get(right);
            maxSum = Math.max(windowSum, maxSum);
        }
        return maxSum;
    }
}
