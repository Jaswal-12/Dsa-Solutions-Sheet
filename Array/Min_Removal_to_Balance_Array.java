// leetcode-3634

class Solution {
    public int minRemoval(int[] nums, int k) {
        int n = nums.length;
        int ans = n - 1;

        for (int i = 0; i < n; i++) {
            int min = nums[i];
            int max = nums[i];

            for (int j = i; j < n; j++) {
                min = Math.min(min, nums[j]);
                max = Math.max(max, nums[j]);

                if (max <= (long) min * k) {
                    ans = Math.min(ans, n - (j - i + 1));
                }
            }
        }
        return ans;
    }
}


// #optimize

import java.util.*;

class Solution {
    public int minRemoval(int[] nums, int k) {
        int n = nums.length;
        Arrays.sort(nums);

        int i = 0;
        int maxWindow = 0;

        for (int j = 0; j < n; j++) {
            // shrink window until condition is satisfied
            while (nums[j] > (long) k * nums[i]) {
                i++;
            }
            maxWindow = Math.max(maxWindow, j - i + 1);
        }

        return n - maxWindow;
    }
}

