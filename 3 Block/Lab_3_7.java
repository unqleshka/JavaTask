public class Lab_3_7 {
    public static boolean isKapreka(int X) {
        String S = "" + (int) Math.pow(X, 2);
        int Kapreka = 0;
        if (S.length() > 1) {
            for (int i = 1; i < S.length(); i++) {
                Kapreka = Integer.parseInt(S.substring(0, i)) + Integer.parseInt(S.substring(i, S.length()));
                if (Kapreka == X)
                    return true;
            }
        }
        return false;
    }

    public static void main(String[] A) {
        System.out.println(isKapreka(297));
    }
}
