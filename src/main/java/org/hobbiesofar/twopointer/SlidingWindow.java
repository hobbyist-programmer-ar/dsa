package org.hobbiesofar.twopointer;

import java.util.List;
class SlidingWindow {
    public static int subarraySumLongest(List<Integer> nums, int target) {
            int windowSum = 0;
            int length = 0;
            int left = 0;
            for(int right = 0; right < nums.size(); right++) {
                windowSum += nums.get(right);
                while(windowSum > target) {
                    windowSum -= nums.get(left);
                    left++;
                }
                length = Math.max(length, right - left + 1);
            }
            return length;
    }
}
