package org.hobbiesofar.binarysearch;


/*
Given an integer, find its square root without using the built-in square root function. Only return the integer part (truncate the decimals).

Input: 16

Output: 4

Input: 8

Output: 2

Explanation: square root of 8 is 2.83..., return the integer part, 2

*/
class SquareRootEstimation {
    public static int squareRoot(int n) {
        // WRITE YOUR BRILLIANT CODE HERE
        if (n == 0) return 0;
        if (n == 1) return 1;
        int left = 0;
        int right = n;
        int result = -1;
        while(left <= right) {
            int mid = left + (right - left) / 2;
            if(mid == n / mid) {
                return mid;
            } else if(mid > n / mid) {
                result = mid;
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return result - 1;
    }
}
