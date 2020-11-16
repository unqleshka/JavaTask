public class Lab_5_4 {
    public static int sumDigProd(int... M) {
        int rezultat = 0;
        String I = "";
        for (int n : M)
            rezultat += n;
        while (Integer.toString(rezultat).length() != 1) { // преобразует и возвращает строку.
            I = Integer.toString(rezultat);
            rezultat = 1;
            for (int i = 0; i < I.length(); i++)
                rezultat *= Integer.parseInt(I.substring(i, i + 1));  //строку в число // возвращает подстраку от индекса до индекса
        }
        return rezultat;
    }

    public static void main(String[] A) {
        System.out.println(sumDigProd(99, 999, 9, 4, 5, 6));
    }
}
