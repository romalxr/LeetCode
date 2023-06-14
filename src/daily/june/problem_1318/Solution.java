package daily.june.problem_1318;

class Solution {
    public int minFlips(int a, int b, int c) {
        String s1 = bits(a);
        String s2 = bits(b);
        String s3 = bits(c);

        int len = Math.max(s1.length(), Math.max(s2.length(), s3.length()));
        s1 = "0".repeat(len - s1.length()).concat(s1);
        s2 = "0".repeat(len - s2.length()).concat(s2);
        s3 = "0".repeat(len - s3.length()).concat(s3);

        utils.Output.Sout(s1, s2, s3);
        int ans = 0;
        for (int i = 0; i < s3.length(); i++) {
            if (s3.charAt(i) == '0') {
                if (s1.charAt(i) == '1') ans++;
                if (s2.charAt(i) == '1') ans++;
            } else {
                if (s1.charAt(i) == '0' &&
                        s2.charAt(i) == '0') ans++;
            }
        }
        return ans;
    }

    private static String bits(int n) {
        return String.format("%4s",
                Integer.toBinaryString(n)).replaceAll(" ", "0");
    }

    public int minFlips2(int a, int b, int c) {

        int result = 0;

        // i <<= 1 means bit shift to left 1 time
        // in that case it equals to i *= 2
        // 000001 -> 000010 -> 000100 ...
        for (int i = 1; i > 0; i <<= 1) {

            utils.Output.Sout("n", i);
            utils.Output.Sout("in", bits(a), bits(b), bits(c));

            // & 1 means 10010101 & 00000001 or take last bit (00000001)
            // & 4 means 10010101 & 00000010 or take second last bit (00000000)
            // n1 can be only one of two options (0, i) depends on the bit
            // other bits ignored
            int n1 = a & i;
            int n2 = b & i;
            int n3 = c & i;

            utils.Output.Sout("&1", bits(n1), bits(n2), bits(n3));

            if (n3 == i) {
                if (n1 == 0 && n2 == 0) { result++; }
            } else {
                if (n1 == i) { result++; }
                if (n2 == i) { result++; }
            }
        }
        return result;
    }
}
