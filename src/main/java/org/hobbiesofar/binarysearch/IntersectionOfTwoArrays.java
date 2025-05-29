package org.hobbiesofar.binarysearch;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

class IntersectionOfTwoArrays {
    public int[] intersection(int[] nums1, int[] nums2) {
        List<Integer> result = new ArrayList<>();
        Set<Integer> inter = Arrays.stream(nums1).boxed().collect(Collectors.toSet());

        for(int num : nums2) {
            if(inter.remove(num)) result.add(num);
        }

        return result.stream().mapToInt(Integer::intValue).toArray();
    }

    public int[] intersectionApproach2(int[] nums1, int[] nums2) {
        boolean[] seen = new boolean[1001];
        for(int num : nums1) {
            seen[num] = true;
        }

        List<Integer> intersectingElements = new ArrayList<>();

        for(int num : nums2) {
            if(seen[num]) {
                intersectingElements.add(num);
                seen[num] = false;
            }
        }
        int[] result = new int[intersectingElements.size()];
        int i = 0;
        for(int num : intersectingElements) {
            result[i] = num;
            i++;
        }

        return result;
    }
}
