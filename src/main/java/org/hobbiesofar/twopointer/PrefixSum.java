package org.hobbiesofar.twopointer;

import java.util.HashMap;
import java.util.List;

class PrefixSum {
    public static List<Integer> subarraySum(List<Integer> arr, int target) {
            // WRITE YOUR BRILLIANT CODE HERE
            HashMap<Integer, Integer> prefixSum = new HashMap<>();
            prefixSum.put(0, 0);
            int currentSum = 0;
            for (int i = 0; i < arr.size(); i++) {
                currentSum += arr.get(i);
                int difference = currentSum - target;
                if(prefixSum.containsKey(difference)) {
                    return List.of(prefixSum.get(difference), i + 1);
                }
                prefixSum.put(currentSum, i + 1);
            }
            return null;
    }
}
