public class Lab_5_3 {
    public static boolean canComplete(String S1, String S2) {
        String F = S2;
        String F2 = "" + S1.charAt(0); //возвращает символ, расположенный по указанному индексу строки.
        ;
        char[] C = S1.toCharArray(); // из строки массив чаров
        String NS = "" + S1.charAt(0);
        String NS2 = "";
        int k = 0;
        if (S1.charAt(0) != S2.charAt(0))
            return false;
        while (S2.length() > 1 && k < S1.length() - 1) {
            if (S2.indexOf(C[k]) != -1) {   //  найти в строке символ и его индекс
                if (S1.charAt(k) == S1.charAt(k + 1)) {
                    NS2 = S2.substring(S2.indexOf(C[k]) + 1); // возвращает подстраку от индекса до индекса
                    if (NS2.indexOf(C[k + 1]) == -1) {
                        return false;
                    }

                }
                if (S2.indexOf(C[k + 1]) != -1) {
                    F2 += C[k + 1];
                    NS += S2.substring(S2.indexOf(C[k]) + 1, S2.indexOf(C[k + 1]) + 1);
                    S2 = S2.substring(S2.indexOf(C[k + 1]));
                } else
                    return false;
            } else
                return false;
            k++;
        }
        return F.equals(NS) && F2.equals(S1);
    }

    public static void main(String[] A) {
        System.out.println(canComplete("bbutl", "beautiful"));
    }
}
