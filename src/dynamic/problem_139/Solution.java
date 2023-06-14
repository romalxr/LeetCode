package dynamic.problem_139;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution {

    public boolean wordBreak2(String s, List<String> wordDict) {
        // dfs
        int n = s.length();
        boolean[] visited = new boolean[n];
        return dfs(s, 0, wordDict, visited);
    }

    public boolean dfs(String s, int start, List<String> wordDict, boolean[] visited) {
        System.out.println(s.substring(start));

        if (start == s.length()) return true;
        if (visited[start]) return false;
        visited[start] = true;
        for (String word : wordDict) {
            if (s.startsWith(word, start)) {
                if (dfs(s, start + word.length(), wordDict, visited)) return true;
            }
        }
        return false;
    }

    public boolean wordBreak(String s, List<String> wordDict) {

        Map<Character, List<String>> insertions = new HashMap<>();
        boolean[] dp = new boolean[s.length() + 1];
        int nxt;

        dp[s.length()] = true;

        for (String word : wordDict) {
            insertions.computeIfAbsent(word.charAt(0), f -> new ArrayList<>()).add(word);
        }

        for (int i = s.length() - 1; i > -1; i--) {
            // Attempt insertion of all strings in wordDict beginning with character s[i]
            for (String word : insertions.getOrDefault(s.charAt(i), new ArrayList<>())) {
                nxt = i + word.length();

                // Check that the substring following the current string (word) can be
                // formed and that the current string (word) is valid
                if (nxt <= s.length() && dp[nxt] && word.equals(s.substring(i, nxt))) {
                    dp[i] = true;
                    break;
                }
            }
        }
        return dp[0];
    }
}
