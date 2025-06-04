package org.hobbiesofar.slidingwindow;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


class FindAllAnagram {
    public static List<Integer> findAllAnagrams(String s, String p) {
        // WRITE YOUR BRILLIANT CODE HERE
        int originalLength = s.length();
        int checkLength = p.length();

        ArrayList<Integer> result = new ArrayList<>();
        if(originalLength < checkLength) return result;
        int[] checkCounter = new int[26];
        int[] window = new int[26];

        for(int i = 0; i < checkLength; i++) {
            checkCounter[p.charAt(i) - 'a']++;
            window[s.charAt(i) - 'a']++;
        }
        if(Arrays.equals(checkCounter, window)) result.add(0);
        for(int i = checkLength; i < originalLength; i++) {
            window[s.charAt(i - checkLength) - 'a']--;
            window[s.charAt(i) - 'a']++;
            if(Arrays.equals(window, checkCounter)) result.add(i - checkLength + 1);
        }

        return result;
    }
}
