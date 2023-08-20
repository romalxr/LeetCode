package utils;

import java.util.ArrayList;
import java.util.List;

public class Converter {
    public static List<Integer> toList(int[] arr) {
        List<Integer> list = new ArrayList<>();
        for (int i : arr) {
            list.add(i);
        }
        return list;
    }
}
