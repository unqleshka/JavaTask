public class Lab_4_2 {
    public static String split(String S) {
        int O= 0;
        int C = 0;
        String NS = "['";
        for (int i = 0; i < S.length(); i++) {
            if (S.charAt(i) == '(') { //возвращает символ, расположенный по указанному индексу строки.
                NS += "(";
                O++;
            }
            if (S.charAt(i) == ')') {
                NS += ")";
                C++;
            }
            if (O == C) {
                if (i != S.length() - 1)
                    NS += "','";
                else
                    NS += "']";
            }
        }
        return NS;
    }
    
    public static void main(String[] args) {
        System.out.println(split("((()))(())()()(()())"));
    }
}
