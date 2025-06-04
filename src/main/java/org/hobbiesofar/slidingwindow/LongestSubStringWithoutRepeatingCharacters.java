package org.hobbiesofar.slidingwindow;

import java.util.*;

class LongestSubStringWithoutRepeatingCharacters {
    public int lengthOfLongestSubstring(String s) {
        int longest = 0;
        int left = 0;
        HashMap<Character, Integer> window = new HashMap<>();
        for(int right = 0; right < s.length(); right++) {
            window.put(s.charAt(right), window.getOrDefault(s.charAt(right), 0) + 1);
            while(window.get(s.charAt(right)) > 1) {
                window.put(s.charAt(left), window.get(s.charAt(left)) - 1);
                left++;
            }
            longest = Math.max(longest, right - left + 1);
        }
        return longest;
    }

    public int lengthOfLongestSubstringA2(String s) {
        int start = 0;
        int max = 0;
        int[] lastSeen = new int[128];
        for(int i = 0; i < s.length(); i++) {
            char x = s.charAt(i);
            if(lastSeen[x] > start) {
                start = lastSeen[x];
            }
            lastSeen[x] = i + 1;
            max = Math.max(max, i + 1 - start);
        }
        return max;
    }
}
