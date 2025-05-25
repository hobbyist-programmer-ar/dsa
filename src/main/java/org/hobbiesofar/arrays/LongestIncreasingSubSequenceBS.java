package org.hobbiesofar.arrays;

import java.util.Arrays;

class LongestIncreasingSubSequenceBS {
    public int lengthOfLIS(int[] nums) {
        int maxLISLength = 1;

        int[] sortedArray = nums.clone();
        Arrays.sort(sortedArray);

        int uniqueNumsCount = 0;
        int length = sortedArray.length;
        for(int i = 0; i < length; i++) {
            if(i == 0 || sortedArray[i] != sortedArray[i - 1]) {
                sortedArray[uniqueNumsCount++] = sortedArray[i];
            }
        }
        BinaryIndexedTree tree = new BinaryIndexedTree(uniqueNumsCount);
        for (int num : nums) {
            int index = binarySearch(sortedArray, num, uniqueNumsCount);
            int currentLISLength = tree.query(index - 1) + 1;
            maxLISLength = Math.max(maxLISLength, currentLISLength);
            tree.update(index, currentLISLength);
        }
        return maxLISLength;
    }

    public int binarySearch(int[] nums, int target, int rightBound) {
        int left = 0;
        while(left < rightBound) {
            int mid = (left + rightBound) >> 1;
            if(nums[mid] >= target) {
                rightBound = mid;
            } else  {
                left = mid + 1;
            }
        }
        return left + 1;
    }
}

class BinaryIndexedTree {
    private int size;
    private int[] tree;

    public BinaryIndexedTree(int size) {
        this.size = size;
        tree = new int[size + 1];
    }

    public void update (int index, int value) {
        while(index <= size) {
            tree[index] = Math.max(tree[index], value);
            index += index & -index;
        }
    }

    public int query(int index) {
        int maxValue = 0;
        while(index > 0) {
            maxValue = Math.max(tree[index], maxValue);
            index -= index & -index;
        }
        return maxValue;
    }
}
