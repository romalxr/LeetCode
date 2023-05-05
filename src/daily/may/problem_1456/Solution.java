package daily.may.problem_1456;

class Solution {
    public int maxVowels(String s, int k) {
        char[] chars = s.toCharArray();

        boolean[] t = new boolean['{'];
        t['a'] = t['e'] = t['i'] = t['o'] = t['u'] = true;

        int vowel = 0;
        for(int i = 0; i < k; i++) {
            if(t[chars[i]]) vowel++;
        }
        int max = vowel;

        for(int i = k; i < s.length(); i++){
            if (t[chars[i]]) vowel++;
            if (t[chars[i - k]]) vowel--;
            if (vowel > max) max = vowel;
        }
        return max;
    }
}
