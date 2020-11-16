public class Lab_5_5 {
    public static String sameVowelGroup(String[] M) {
        String S = M[0];
        String FirstWord = "";
        String NextWord = "";
        String sl = "";
        String Rezultat = "['" + S + "',";
        boolean a = true;
        int X1 = 0, X2 = 0;
        S = S.toLowerCase();
        for (int i = 0; i < S.length(); i++) {
            if (S.charAt(i) == 'a' ||
                S.charAt(i) == 'e' || 
                S.charAt(i) == 'i' || 
                S.charAt(i) == 'o' || 
                S.charAt(i) == 'u' || 
                S.charAt(i) == 'y') {
                if (FirstWord.indexOf(S.charAt(i)) == -1) //  найти в строке символ и его индекс // возвращает символ, расположенный по указанному индексу строки.
                    X1++;
                FirstWord += S.charAt(i);
            }
        }
        for (int i = 1; i < M.length; i++) {
            NextWord = M[i].toLowerCase();
            for (int j = 0; j < NextWord.length(); j++) {
                if (NextWord.charAt(j) == 'a' || 
                    NextWord.charAt(j) == 'e' || 
                    NextWord.charAt(j) == 'i' || 
                    NextWord.charAt(j) == 'o' || 
                    NextWord.charAt(j) == 'u' || 
                    NextWord.charAt(j) == 'y') {
                    if (FirstWord.indexOf(NextWord.charAt(j)) != -1) {
                        if (sl.indexOf(NextWord.charAt(j)) == -1) {
                            X2++;
                        }
                        sl += NextWord.charAt(j);
                    } else
                        a = false;
                }
            }
            if (a == true && X1 == X2) {
                Rezultat += "'" + NextWord + ",'";
            }
            a = true;
            X2 = 0;
            sl = "";
        }
        return Rezultat.substring(0, Rezultat.length() - 2) + "']";
    }

    public static void main(String[] A) {
        String[] mas = { "hoops", "chuff", "bot", "bottom" };
        System.out.println(sameVowelGroup(mas));
    }
}
