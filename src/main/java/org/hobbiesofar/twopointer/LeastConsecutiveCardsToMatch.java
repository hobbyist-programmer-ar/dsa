package org.hobbiesofar.twopointer;

import java.util.HashMap;
import java.util.List;

class LeastConsecutiveCardsToMatch {
    public static int leastConsecutiveCardsToMatch(List<Integer> cards) {
            int shortest = cards.size() + 1;
            int left = 0;
            HashMap<Integer, Integer> window = new HashMap<>();
            for(int right = 0; right < cards.size(); right++) {
                window.put(cards.get(right), window.getOrDefault(cards.get(right), 0) + 1);
                while(window.get(cards.get(right)) == 2) {
                    shortest = Math.min(shortest, right - left + 1);
                    window.put(cards.get(left), window.get(cards.get(left)) - 1);
                    left++;
                }
            }
            return shortest != cards.size() + 1 ? shortest : -1;
    }
}
