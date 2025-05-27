package org.hobbiesofar.binarysearch;


/*
Given an array of integers sorted in increasing order and a target, find the index of the first element in the array that is larger than or equal to the target. Assume that it is guaranteed to find a satisfying number.

Input:

arr = [1, 3, 3, 5, 8, 8, 10]
target = 2
Output: 1

Explanation: The first element larger than 2 is 3, which has index 1.

Input:

arr = [2, 3, 5, 7, 11, 13, 17, 19]
target = 6
Output: 3

Explanation: The first element larger than 6 is 7, which has index 3.

*/

import java.util.List;
class FirstElementNotSmallerThanTheTarget {
    public static int firstNotSmaller(List<Integer> arr, int target) {
            int n = arr.size();
            int left = 0;
            int right = n - 1;
            int boundaryIndex = 0;
            while(left < right) {
                int mid = left + (right - left)/2;
                if(arr.get(mid) <= target) {
                    left = mid + 1;
                } else {
                    boundaryIndex = mid;
                    right = mid - 1;
                }
            }
            return boundaryIndex;
    }
}
