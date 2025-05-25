package org.hobbiesofar.arrays;

class CountGoodTriplets {
    public int countGoodTriplets(int[] arr, int a, int b, int c) {
        int arrayLength = arr.length;
        int goodTripletsCount = 0;

        for(int i = 0; i < arrayLength; i++) {
            for(int j = i + 1; j < arrayLength; j++) {
                for (int k = j + 1; k < arrayLength; k++) {
                    if(Math.abs(arr[i] - arr[j]) <= a &&
                        Math.abs(arr[j] - arr[k]) <= b &&
                        Math.abs(arr[k] - arr[i]) <= c) {
                            goodTripletsCount++;
                        }
                }
            }
        }
        return goodTripletsCount;
    }
}
