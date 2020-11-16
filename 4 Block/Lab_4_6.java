public class Lab_4_6 {
    public static int bugger(int X) {
        String S = "" + X;
        int sum = 0;
        int Z = 0;
        while (S.length() > 1) 
        {
            sum = 1;
            for (int i = 0; i < S.length(); i++) // длина строки
            {
               sum = sum * Integer.parseInt("" +S.charAt(i)); // преобразует строку в число // возвращает символ, расположенный по указанному индексу строки.
            }
            Z++;
            S = "" + sum;
        }
        return Z;
    }

    public static void main(String[] A) {
        System.out.println(bugger(99999));
    }
}
