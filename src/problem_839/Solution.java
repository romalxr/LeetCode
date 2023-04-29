package problem_839;

import java.util.ArrayList;
import java.util.List;

class Solution {
    public int numSimilarGroups(String[] strs) {

        if (strs.length == 0) {
            return 0;
        }

        int result = 0;
        int len = strs[0].length();

        List<List<String>> groups = new ArrayList<>();

        for (String str : strs) {
            List<String> firstGroup = null;
            for (List<String> group : groups) {
                boolean hasSimilar = false;
                for (String word : group) {
                    hasSimilar = checkSimilar(len, str, word);
                    if (hasSimilar) {
                        break;
                    }
                }

                if (hasSimilar) {
                    if (firstGroup == null) {
                        firstGroup = group;
                        group.add(str);
                    } else {
                        firstGroup.addAll(group);
                        group.clear();
                        result--;
                    }
                }
            }

            if (firstGroup == null) {
                List<String> newGroup = new ArrayList<>();
                newGroup.add(str);
                groups.add(newGroup);
                result++;
            }
        }

        return result;
    }

    private static boolean checkSimilar(int len, String str, String word) {
        int diffs = 0;
        for (int k = 0; k < len; k++) {
            if (str.charAt(k) != word.charAt(k)) {
                diffs++;
                if (diffs > 2) {
                    break;
                }
            }
        }
        return diffs <= 2;
    }

}