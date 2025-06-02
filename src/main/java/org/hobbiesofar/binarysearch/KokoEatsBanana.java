package org.hobbiesofar.binarysearch;

class KokoEatsBanana {
    public int minEatingSpeed(int[] piles, int h) {
        int minSpeed = 1;
        int maxSpeed = (int) 1e9;
        while(minSpeed < maxSpeed) {
            int midSpeed = minSpeed + (maxSpeed - minSpeed) / 2;
            int totalHours =0;
            for(int bananas : piles) {
                totalHours += (bananas + midSpeed - 1) / midSpeed;
            }
            if(totalHours <= h) {
                maxSpeed = midSpeed;
            } else {
                minSpeed = midSpeed + 1;
            }
        }
        return minSpeed;
    }
}
