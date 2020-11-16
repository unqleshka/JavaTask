public class Lab_5_1 {
    public static String encrypt(String S) {
        char[] C = S.toCharArray(); // из строки массив чаров
        String NS = "[" + (int) C[0] + ", ";
        for (int i = 1; i < C.length; i++) {
            NS += (int) C[i] - (int) C[i - 1] + ", ";
        }
        return NS.substring(0, NS.length() - 2) + "]"; // возвращает подстраку от индекса до индекса
    }

    public static String decrypt(int[] M) {
        String NS = "" + (char) M[0];
        int sum = M[0];
        for (int i = 1; i < M.length; i++) {
            sum += M[i];
            NS += (char) sum;
        }
        return NS;
    }

    public static void main(String[] A) {
        System.out.println(encrypt("Hello"));
        int[] mas = { 72, 33, -73, 84, -12, -3, 13, -13, -68 };
        System.out.println(decrypt(mas));
    }
}