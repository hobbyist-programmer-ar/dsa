package org.hobbiesofar.arrays;


class CountSpecialQuadruplets {
    public int countQuadruplets(int[] nums) {
        int count = 0;
        int length = nums.length;

        int[] differenceCounter = new int[310];

        for(int b = length - 3; b > 0; b--) {
            int c = b + 1;
            for(int d = c + 1; d < length; d++) {
                int difference = nums[d] - nums[c];
                if(difference >= 0) {
                    ++differenceCounter[difference];
                }
            }

            for(int a = 0; a < b; a++) {
                int sum = nums[a] + nums[b];
                count += differenceCounter[sum];
            }
        }
        return count;
    }
}
