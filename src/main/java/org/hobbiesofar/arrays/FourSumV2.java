package org.hobbiesofar.arrays;

import java.util.*;
class FourSumV2 {
    public int fourSumCount(int[] nums1, int[] nums2, int[] nums3, int[] nums4) {
        int numberOfQuadruplets=0;
        HashMap<Integer, Integer> pairOneSumeCounter = new HashMap<>();
        for(int num1 : nums1) {
            for(int num2 : nums2) {
                int sums = num1 + num2;
                pairOneSumeCounter.merge(sums, 1, Integer::sum);
            }
        }
        for(int num3 : nums3) {
            for(int num4 : nums4) {
                int sums2 = num3 + num4;
                numberOfQuadruplets += pairOneSumeCounter.getOrDefault(-(sums2), 0);
            }
        }

        return numberOfQuadruplets;
    }
}
