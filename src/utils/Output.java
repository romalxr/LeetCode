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
}
