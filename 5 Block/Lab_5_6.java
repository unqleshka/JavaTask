public class Lab_5_6 {
    public static boolean validateCard(long N) {
        if (("" + N).length() <= 14 && 
            ("" + N).length() >= 19) {
            return false;
        }
        String s;
        int sum = 0;
        int kontrolChifra = Integer.parseInt(("" + N).substring(("" + N).length() - 1));// строку в число // Подстрока начинается с символа, заданного индексом, и продолжается до конца. Последняя цифра
        int len = ("" + N).length() - 2;
        while (len >= 0) {
            s = "" + ("" + N).charAt(len);//Переворот цифр
            if (Integer.parseInt(s) % 2 != 0) {
                s = "" + Integer.parseInt(s) * 2;
                if (s.length() > 1) {
                    s = "" + (Integer.parseInt(s.substring(0, 1)) + Integer.parseInt(s.substring(1, 2)));
                }
            }
            sum += Integer.parseInt(s);
            len--;
        }
        return ("" + (10 - Integer.parseInt(("" + sum).substring(("" + sum).length() - 1)))).equals("" + kontrolChifra); // сравнивает строку с указанным объектом
    }

    public static void main(String[] A) {
        System.out.println(validateCard(1234567890123456L));
    }
}
