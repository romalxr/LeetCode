package daily.may.problem_649;

import java.util.TreeSet;

class Solution {
    public String predictPartyVictory(String senate) {
        boolean[] banned = new boolean[senate.length()];
        char[] chars = senate.toCharArray();

        TreeSet<Integer> dSet = new TreeSet<>();
        TreeSet<Integer> rSet = new TreeSet<>();
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == 'D') {
                dSet.add(i);
            } else {
                rSet.add(i);
            }
        }

        boolean wasD = true;
        boolean wasR = true;
        while (wasD && wasR) {
            wasD = false;
            wasR = false;
            for (int i = 0; i < chars.length; i++) {
                if (banned[i]) {
                    continue;
                }

                wasD = wasD || chars[i] == 'D';
                wasR = wasR || chars[i] == 'R';

                TreeSet<Integer> set = chars[i] == 'D' ? rSet : dSet;
                if (set.isEmpty()) {
                    break;
                }

                Integer ind = set.ceiling(i + 1);
                if (ind == null) {
                    ind = set.first();
                }

                set.remove(ind);
                banned[ind] = true;
            }
        }
        return wasD ? "Dire" : "Radiant";
    }

}
