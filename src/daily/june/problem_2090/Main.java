package daily.june.problem_2090;

import java.io.*;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = { 1,2,3 };
        System.out.println(Arrays.toString(solution.getAverages(nums, 1)));

        nums = readInput();
        System.out.println(Arrays.toString(solution.getAverages(nums, 40000)));
    }

    private static int[] readInput() {
        try {
            Scanner scanner = new Scanner(new FileReader("input.txt"));
            String[] strings = scanner.nextLine().split(",");
            return Arrays.stream(strings).mapToInt(Integer::parseInt).toArray();
        } catch (FileNotFoundException e) {
            return new int[] {};
        }
    }
}
