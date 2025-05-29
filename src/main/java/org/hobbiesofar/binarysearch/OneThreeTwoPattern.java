package org.hobbiesofar.binarysearch;

import java.util.Deque;
import java.util.ArrayDeque;

class OneThreeTwoPattern {
    public boolean find132pattern(int[] nums) {
        if(nums.length < 3) return false;

        int potentialMidValue = Integer.MIN_VALUE;
        Deque<Integer> stack = new ArrayDeque<>();
        for(int i = nums.length - 1; i >= 0; i--) {
            if(nums[i] < potentialMidValue) {
                return true;
            }

            while(!stack.isEmpty() && stack.peek() < nums[i]) {
                potentialMidValue = stack.pop();
            }
            stack.push(nums[i]);
        }
        return false;
    }
}
