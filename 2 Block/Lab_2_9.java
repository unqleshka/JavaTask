public class Lab_2_9 {
    public static boolean isPrefix(String W, String P) {
        return W.startsWith(P.substring(0, P.length() - 1));
    }

    public static boolean isSuffix(String W, String S) {
        return W.endsWith(S.substring(1, S.length()));
    }

    public static void main(String[] args) {
        System.out.println(isPrefix("automation", "auto-"));
        System.out.println(isSuffix("vocation", "-logy"));
    }
}
