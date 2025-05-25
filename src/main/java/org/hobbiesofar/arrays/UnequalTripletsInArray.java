package org.hobbiesofar.arrays;

import java.util.*;
class UnequalTripletsInArray {

    public int unequalTriplets(int[] nums) {
        int answer = 0;
        Map<Integer, Integer> frequencyMap = new HashMap<>();
        for(int num : nums) {
            frequencyMap.merge(num, 1, Integer::sum);
        }

        int prefixCount = 0;
        int n = nums.length;

        for(int frequency : frequencyMap.values()) {
            int suffixCount = n - prefixCount - frequency;
            answer += prefixCount * frequency * suffixCount;
            prefixCount += frequency;
        }
        return answer;
    }

}
