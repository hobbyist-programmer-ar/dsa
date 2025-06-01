package org.hobbiesofar.twopointer;

import java.util.List;

class RemoveDuplicates {
    public static int removeDuplicates(List<Integer> arr) {
        // WRITE YOUR BRILLIANT CODE HERE
        int slow = 0;
        for(int fast = 0; fast < arr.size(); fast++) {
            if(!arr.get(fast).equals(arr.get(slow))) {
                slow++;
                arr.set(slow, arr.get(fast));
            }
        }
        return slow + 1;
    }
}
