package org.hobbiesofar.arrays;

import java.util.*;

class ThreeSum {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> triplets = new ArrayList<>();
        Arrays.sort(nums);
        for (int first = 0; first < nums.length - 1; first++) {
            if(first > 0 && nums[first] == nums[first - 1]) {
                continue;
            }
            int second = first + 1;
            int third = nums.length - 1;
            while(second < third) {
                int sum = nums[first] + nums[second] + nums[third];

                if(sum == 0) {
                    triplets.add(List.of(nums[first] , nums[second] , nums[third]));
                    while(second < third && nums[second] == nums[second + 1]) {
                        second++;
                    }
                    while(second < third && nums[third] == nums[third - 1]) {
                        third--;
                    }
                    third--;
                    second++;
                } else if(sum > 0) {
                    third--;
                } else {
                    second++;
                }
            }
        }
        return triplets;
    }
}


/*
    public List<List<Integer>> threeSum(int[] arr) {
		return new AbstractList<>() {
			List<List<Integer>> ans;
			@Override
			public int size() {
				if (ans == null)
					ans = createList(arr);
				return ans.size();
			}

			@Override
			public List<Integer> get(int index) {
				if (ans == null)
					ans = createList(arr);
				return ans.get(index);
			}
		};
	}

	private List<List<Integer>> createList(int[] arr) {
		List<List<Integer>> ans = new ArrayList<>();
		int len = arr.length;
		Arrays.sort(arr);
		for (int i = 0; i < len - 2 && arr[i] <= 0; ++i) {
			if (i > 0 && arr[i] == arr[i - 1])
				continue;
			twoSum(ans, arr, i + 1, len - 1, -arr[i]);
		}
		return ans;
	}

	private void twoSum(List<List<Integer>> ans, int[] arr, int left, int right, int target) {
		while (left < right) {
			if (arr[left] + arr[right] > target) {
				--right;
				continue;
			}
			if (arr[left] + arr[right] < target) {
				++left;
				continue;
			}

			ans.add(Arrays.asList(-target, arr[left++], arr[right--]));

			while (left <= right && arr[left] == arr[left - 1])
				++left;
		}
	}
*/
