package org.hobbiesofar.binarysearch;

class Solution {
    public static int binarySearch(List<Integer> arr, int target) {
        // WRITE YOUR BRILLIANT CODE HERE
        int n = arr.size();
        int left = 0;
        int right = n - 1;
        while(left <= right) {
            int mid = left + (right - left)/2;
            if(target == arr.get(mid)) {
                return mid;
            } else if (target > arr.get(mid)) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1;
    }
}
