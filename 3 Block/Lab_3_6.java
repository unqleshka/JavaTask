public class Lab_3_6 {
    public static boolean same(int[] M1, int[] M2) {
        int S1 = 0;
        int S2 = 0;
        for (int i = 0; i < M1.length; i++) {
            int j;
            for (j = 0; j < i; j++) {
                if (M1[i] == M1[i])
                    break;
            }
            if (i == j)
                S1++;
        }
        for (int i = 0; i < M2.length; i++) {
            int j;
            for (j = 0; j < i; j++) {
                if (M2[i] == M2[i])
                    break;
            }
            if (i == j)
                S2++;
        }
        if (S1 == S2)
            return true;
        else
            return false;
    }
    public static void main(String[] args) {
        int[] M1 = { 2, 4, 6, 6, 6};
        int[] M2 = { 3, 7, 8};
        System.out.println(same(M1, M2));
    }
}
