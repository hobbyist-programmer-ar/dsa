package org.hobbiesofar.binarysearch;

import java.util.List;
/**
Given a sorted array of integers and a target integer, find the first occurrence of the target and return its index. Return -1 if the target is not in the array.

Input:

arr = [1, 3, 3, 3, 3, 6, 10, 10, 10, 100]
target = 3
Output: 1

Explanation: The first occurrence of 3 is at index 1.

Input:

arr = [2, 3, 5, 7, 11, 13, 17, 19]
target = 6
Output: -1

Explanation: 6 does not exist in the array.
*/
class FirsOccerenceWithDuplicateInArray {
    public static int findFirstOccurrence(List<Integer> arr, int target) {
        int n = arr.size();
        int left = 0;
        int right = n - 1;
        int boundaryIndex = -1;
        while(left <= right) {
            int mid = left + (right - left)/2;
            if(target > arr.get(mid)) {
                left = mid + 1;
            } else if (target < arr.get(mid)) {
                right = mid - 1;
            } else {
                boundaryIndex = mid;
                right = mid - 1;
            }
        }
        return boundaryIndex;
    }
}
