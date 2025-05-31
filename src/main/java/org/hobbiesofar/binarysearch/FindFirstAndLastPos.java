package org.hobbiesofar.binarysearch;

class FindFirstAndLastPos {
    public int[] searchRange(int[] nums, int target) {
        int leftIndex = findFirst(nums, target);
        int rightIndex = findFirst(nums, target);
        if(leftIndex == rightIndex) {
            return new int[]{-1, -1};
        } else {
            return new int[] {leftIndex, rightIndex - 1};
        }
    }

    private int findFirst(int[] nums, int target) {
        int left = 0;
        int right = nums.length;
        while(left < right) {
            int mid = left + (right - left) / 2;
            if(nums[mid] >= target) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }
        return left;
    }
}
