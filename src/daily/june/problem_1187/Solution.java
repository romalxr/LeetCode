package daily.june.problem_1187;

import java.util.*;
import java.util.stream.Collectors;

class Solution {

    static int lowerBound(int array[], int key)
    {
        int lowerBound = 0;

        while (lowerBound < array.length) {
            if (key > array[lowerBound])
                lowerBound++;
            else
                return lowerBound;
        }

        return lowerBound;
    }

    public int makeArrayIncreasing(int[] arr1, int[] arr2) {

        int[] nums1 = new int[arr1.length + 1];
        System.arraycopy(arr1, 0, nums1, 0, arr1.length);
        nums1[nums1.length - 1] = Integer.MAX_VALUE;

        TreeSet<Integer> set = Arrays.stream(arr2)
                .boxed()
                .collect(Collectors.toCollection(TreeSet::new));
        int[] nums2 = set.stream().mapToInt(Integer::intValue).toArray();

        int n = nums1.length;
        int[] f = new int[n];

        for (int i = 0; i < n; ++i) {
            int k = lowerBound(nums2, nums1[i]);
            int res = k < i ? Integer.MIN_VALUE : 0;

            if (i > 0 && nums1[i - 1] < nums1[i]) {
                res = Math.max(res, f[i - 1]);
            }
            for (int j = i - 2; j > i - k - 1 && j >= 0; j--) {
                if (nums2[k - (i - j - 1)] > nums1[j]) {
                    res = Math.max(res, f[j]);
                }
            }
            f[i] = res + 1;
        }
        return f[n - 1] < 0 ? -1 : n - f[n - 1];
    }
}
