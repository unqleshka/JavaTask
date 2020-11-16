public class Lab_4_9 {
    public static boolean trouble(long X, long Z) {
        String S1 = "" + X;
        String S2 = "" + Z;
        int K = 0, K2 = 0;
        for (int i = 0; i < S1.length(); i++) {
            if (i != S1.length() - 1) {
                if (S1.charAt(i) == S1.charAt(i + 1)) // возвращает символ, расположенный по указанному индексу строки.
                    K++;
                else
                    K = 0;
                if (K== 2) {
                    for (int j = 0; j < S2.length(); j++) {
                        if (S1.charAt(i) == S2.charAt(j)) {
                            K2++;
                        } else {
                            K2 = 0;
                        }
                        if (K2 == 2) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    public static void main(String[] A) {
        System.out.println(trouble(555678, 3455778));
    }
}
