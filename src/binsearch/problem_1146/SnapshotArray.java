package binsearch.problem_1146;

import java.util.TreeMap;

class SnapshotArray {

    int snap = 0;
    TreeMap<Integer, Integer>[] maps;

    public SnapshotArray(int length) {
        maps = new TreeMap[length];
        for (int i = 0; i < maps.length; i++) {
            maps[i] = new TreeMap<>();
        }
    }

    public void set(int index, int val) {
        maps[index].put(snap, val);
    }

    public int snap() {
        return snap++;
    }

    public int get(int index, int snap_id) {
        var entry = maps[index].floorEntry(snap_id);
        if (entry == null) return 0;
        return entry.getValue();
    }

}
