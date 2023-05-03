package daily.may.problem_2215;

import java.util.*;
import java.util.stream.Collectors;

class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {

        Set<Integer> set1 = Arrays.stream(nums1).boxed().collect(Collectors.toSet());
        Set<Integer> set2 = Arrays.stream(nums2).boxed().collect(Collectors.toSet());
        Set<Integer> setTemp = new HashSet<>(set1);

        set1.removeAll(set2);
        set2.removeAll(setTemp);

        List<List<Integer>> result = new ArrayList<>();
        result.add(set1.stream().toList());
        result.add(set2.stream().toList());

        return result;

    }
}
