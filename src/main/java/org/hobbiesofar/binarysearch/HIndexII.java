package org.hobbiesofar.binarysearch;

class HIndexII {
    public int hIndex(int[] citations) {
        int numsPapers = citations.length;
        int low = 0;
        int high = numsPapers;
        while(low < high) {
            int mid = low + (high - low) / 2;
            if(citations[numsPapers - mid] >= mid) {
                low = mid;
            } else  {
                high = mid - 1;
            }
        }
        return low;
    }
}
