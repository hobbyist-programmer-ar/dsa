package org.hobbiesofar.binarysearch;

import java.util.List;


class FindPeak {
    public static int peakOfMountainArray(List<Integer> arr) {
            // WRITE YOUR BRILLIANT CODE HERE
        int n = arr.size();
        int left = 0;
            int right = n - 1;
            int boundaryIndex = -1;
        while(left <= right) {
            int mid = left + (right - left) / 2;
            if(arr.get(mid) > arr.get(mid + 1)) {
                boundaryIndex = mid;
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return boundaryIndex;
    }

    public int findPeakElement(int[] nums) {
        int n = nums.length;
        int left = 0;
            int right = n - 1;
            int boundaryIndex = -1;
        while(left < right) {
            int mid = left + (right - left) / 2;
            if(nums[mid] > nums[mid + 1]) {
                boundaryIndex = mid;
                right = mid;
            } else {
                left = mid + 1;
            }
        }
        return boundaryIndex;
    }
}
