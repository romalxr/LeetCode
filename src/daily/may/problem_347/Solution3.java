package daily.may.problem_347;

import java.util.*;

class Solution3 {

    static Random rnd = new Random(new Date().getTime());

    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int n : nums) {
            map.put(n, map.getOrDefault(n, 0) + 1);
        }

        int n = map.size();
        int[][] array = new int[n][];
        int[] ind = { 0 };
        map.forEach((key, value) -> array[ind[0]++] = new int[] { value, key } );

        nth_element(array, 0, n, k - 1);

        Arrays.stream(array).forEach(t -> System.out.print(t[0] + ":" + t[1] + " "));
        System.out.println();

        int[] ans = new int[k];
        for (int i = 0; i < k; i++) {
            ans[i] = array[i][1];
        }
        return ans;
    }

    private static int nth_element(int[][] nums, int l, int r, int k) {
        if (r - l == 1) return nums[k][1];

        int ind = l + rnd.nextInt(r - l);
        int x = nums[ind][0];
        int ml = l;
        int mr = l;
        for (int i = l; i < r; i++) {
            if (nums[i][0] > x) {
                swap(nums, i, ml);
                if(ml != mr) {
                    swap(nums, i, mr);
                }
                ml++;
                mr++;
            } else if (nums[i][0] == x) {
                swap(nums, i, mr);
                mr++;
            }
        }
        //System.out.println("x, l, r: " + ind + " " + l + " " + r + " " + Arrays.toString(nums));

        if (k < ml) {
            return nth_element(nums, l, ml, k);
        } else if (k >= mr) {
            return nth_element(nums, mr, r, k);
        }
        return nums[k][1];
    }

    private static void swap(int[][] nums, int l, int r) {
        int[] buff = nums[l];
        nums[l] = nums[r];
        nums[r] = buff;
    }
}
