public class Lab_3_8 {
    public static String longestZero(String S) {
        int min = 0;
        int max = 0;
        int idx1 = 0;
        int idx2 = 0;
        for (int i = 0; i < S.length(); i++) {
            if (S.charAt(i) == '0') {
                idx1 = i + 1;
                min++;
                if (min > max) {
                    max = min;
                    idx2 = idx1;
                }
            }
            else
            {
                min = 0;
            }
        }
        return S.substring(idx2 - max, idx2);
    }

    public static void main(String[] args) {
        System.out.println(longestZero("011100010010000101"));
    }
}
