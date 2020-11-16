public class Lab_2_8 {
    public static boolean isStrangePair(String S , String K )
    {
        if (S.charAt(0) == K.charAt(K.length() - 1) && S.charAt(S.length() - 1) == K.charAt(0))
            return true;

        else
            return false;
    }

    public static void main(String[] args) {
        System.out.println(isStrangePair("super", "robots"));
    }
}
