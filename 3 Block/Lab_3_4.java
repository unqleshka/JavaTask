public class Lab_3_4 {
    public static String flipEndChars(String S) {
        if(S.length()<2)
            return "Incompatible";
        if (S.charAt(0)==S.charAt(S.length()-1))
            return "Two's a pair.";
        S = S.charAt(S.length()-1)+S.substring(1, S.length()-1)+S.charAt(0);
        return S;
    }

    public static void main(String[] A) {
        System.out.println(flipEndChars("Cat, dog, and mouse."));
    }
}