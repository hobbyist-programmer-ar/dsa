package org.hobbiesofar.binarysearch;

import java.util.List;


/*
An array of boolean values is divided into two sections: The left section consists of all false, and the right section consists of all true. Find the First True in a Sorted Boolean Array of the right section, i.e., the index of the first true element. If there is no true element, return -1.

Input: arr = [false, false, true, true, true]

Output: 2

Explanation: The first true's index is 2.
*/
class FindBooleanBoundary {
    public static int findBoundary(List<Boolean> arr) {
            int n = arr.size();
            int left = 0;
            int right = n -1;
            int boundaryIndex = -1;
            while(left <= right) {
                int mid = left + (right - left)/2;
                if(arr.get(mid)) {
                    boundaryIndex = mid;
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }
            }
            return boundaryIndex;
    }
}
