package org.hobbiesofar.twopointer;

import java.util.List;

class ShortestSumSubarrayLessThanK {
    public static int subarraySumShortest(List<Integer> nums, int target) {
        int windowSum = 0;
        int left = 0;
        int length = nums.size() + 1;
        for (int right = 0; right < nums.size(); right++) {
            windowSum += nums.get(right);
            while(windowSum >= target) {
                length = Math.min(length, right - left + 1);
                windowSum -= nums.get(left);
                left++;
            }
        }
        if(length > nums.size()) {
            return 0;
        }
        return length;
    }
}
