package org.hobbiesofar.binarysearch;

class MissingNumber {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int result = n;
        int ap = n * (n+1)/2;
        int missing = 0;
        for(int i = 0; i < n; i++) {
            ap -= nums[i];
            missing = ap;
            result ^= i ^ nums[i];
        }
        return missing;
    }
}
