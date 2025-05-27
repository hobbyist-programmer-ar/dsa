package org.hobbiesofar.binarysearch;

import java.util.List;
/*
A sorted array of unique integers was rotated at an unknown pivot. For example, [10, 20, 30, 40, 50] becomes [30, 40, 50, 10, 20]. Find the index of the minimum element in this array.

Input: [30, 40, 50, 10, 20]

Output: 3

Explanation: The smallest element is 10, and its index is 3.

Input: [3, 5, 7, 11, 13, 17, 19, 2]

Output: 7

Explanation: The smallest element is 2, and its index is 7.
*/
class FindMinInRotatedSortedArray {
    public static int findMinRotated(List<Integer> arr) {
        // WRITE YOUR BRILLIANT CODE HERE
        int n = arr.size();
        int left = 0;
        int right = n - 1;
        int boundaryIndex = -1;
        while(left <= right) {
            int mid = left + (right - left) / 2;
            if(arr.get(mid) <= arr.get(arr.size() - 1)) {
                boundaryIndex = mid;
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return boundaryIndex;
    }
}
