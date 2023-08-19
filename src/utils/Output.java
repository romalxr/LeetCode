package utils;

public class Output {

    public static void Sout(Object ... args) {
        StringBuilder sb = new StringBuilder();
        sb.append("-> ");
        for (Object arg : args) {
            sb.append(arg).append(" ");
        }
        System.out.println(sb);
    }
    public static void PrintMatrix(int[][] matrix) {
        for (int[] line : matrix) {
            StringBuilder sb = new StringBuilder();
            for (int num : line) {
                sb.append(num).append(" ");
            }
            System.out.println(sb);
        }
    }
}
