public class Lab_6_2 {
    public static String translateWord(String S) {
        if (S != "") {
            String NS = "";
            char C = S.charAt(0);
            S = S.toLowerCase();
            if (S.matches("^(?i:[bcdfghjklmnpqrstvwxyz]).*") == true) {
                while (S.matches("^(?i:[bcdfghjklmnpqrstvwxyz]).*") == true) {
                    NS += S.charAt(0);
                    S = S.substring(1);
                }
                S += NS + "ay";
            } else if (S.matches("^(?i:[aeiouy]).*") == true) {
                S += "yay";
            }
            if (Character.toUpperCase(C) == C) {
                S = Character.toUpperCase(S.charAt(0)) + S.substring(1);
            }
        }
        return S;
    }

    public static String translateSentence(String S) {
        String NS = (S + " ");
        S = "";
        String s = "";
        while (NS.length() > 1) {
            if (NS.matches("^(?i:[bcdfghjklmnpqrstvwxyz]).*") == true
                    || NS.matches("^(?i:[aeiouy]).*") == true) {
                s += NS.charAt(0);
                NS = NS.substring(1);
            } else {
                S += translateWord(s) + NS.charAt(0);
                s = "";
                if (NS.length() > 1)
                    NS = NS.substring(1);
            }
        }
        return S;
    }

    public static void main(String[] A) {
        System.out.println(translateWord(""));
        System.out.println(translateSentence(" Buttt|on sdsa dasd ad. "));
    }
}
