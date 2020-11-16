public class Lab_6_7 {
    public static String longestNonrepeatingSubstring(String S) {
        String NS1 = "";
        String NS2 = "";
        for (int i = 0; i < S.length(); i++) {
            if (NS1.indexOf(S.charAt(i)) == -1) {
                NS1 += S.charAt(i);
            } else {
                if (NS1.length() > NS2.length())
                    NS2 = NS1;
                NS1 = "";
                i--;
            }
            if (i == S.length() - 1) {
                if (NS1.length() > NS2.length())
                    NS2 = NS1;
            }
        }
        return NS2;
    }

    public static void main(String[] A) {
        System.out.println(longestNonrepeatingSubstring("abcda"));
    }
}
