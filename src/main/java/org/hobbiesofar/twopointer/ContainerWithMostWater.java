package org.hobbiesofar.twopointer;

import java.util.*;


class ContainerWithMostWater {
    public static int containerWithMostWater(List<Integer> arr) {
        // WRITE YOUR BRILLIANT CODE HERE
        int left = 0;
        int right = arr.size() - 1;
        int maxArea = 0;
        while(left < right) {
            int currentArea = Math.min(arr.get(left), arr.get(right)) * (right - left);
            maxArea = Math.max(maxArea, currentArea);
            if(arr.get(left) < arr.get(right)) {
                left++;
            } else {
                right--;
            }
        }
        return maxArea;
    }
    public int maxArea(int[] height) {
        int maxArea = 0;
        int left = 0;
        int right = height.length - 1;
        while(left < right) {
            int currentArea = Math.min(height[left], height[right]) * (right - left);
            maxArea = Math.max(maxArea, currentArea);
            if(height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }
        return maxArea;
    }
}
