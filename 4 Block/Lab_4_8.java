public class Lab_4_8 {
    public static boolean doesRhyme(String S1, String S2) {
        String A = "", B = "";
        char X = ' ';
        A = A.substring(A.lastIndexOf(" ") + 1); //возвращает подстраку от индекса до индекса // ндекс в данной строке последнего вхождения указанного символа
        for (int i = 0; i < A.length(); i++) {
            X = Character.toLowerCase(A.charAt(i)); // возвращает в нижний регистр
            if (X == 'a' || 
                X == 'e' || 
                X == 'i' || 
                X == 'o' || 
                X == 'u' || 
                X == 'y') {
                A += X;
            }
        }
        B = B.substring(B.lastIndexOf(" ") + 1);
        for (int i = 0; i < B.length(); i++) {
            X = Character.toLowerCase(B.charAt(i));
            if (X == 'a' || 
                X == 'e' || 
                X == 'i' || 
                X == 'o' || 
                X == 'u' || 
                X == 'y') {
                B += X;
            }
        }
        return  A.equals(B);
    }
    public static void main(String[] C) {
        System.out.println(doesRhyme("Sam I am!", "Green eggs and HAM."));
    }
}
