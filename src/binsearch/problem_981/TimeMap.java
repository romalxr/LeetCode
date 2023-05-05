package binsearch.problem_981;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

class TimeMap {

    private final Map<String, Map<Integer, String>> map = new HashMap<>();

    public TimeMap() {

    }

    public void set(String key, String value, int timestamp) {
        map.computeIfAbsent(key, k -> new TreeMap<>()).put(timestamp, value);
    }

    public String get(String key, int timestamp) {
        TreeMap<Integer, String> tree = (TreeMap<Integer, String>) map.get(key);
        if (tree == null) return "";
        var entry = tree.floorEntry(timestamp);
        if (entry == null) return "";
        return entry.getValue();
    }
}
