public class Lab_3_5 {
    public static boolean isValidHexCod(String S) {
        if (S.matches("(#[a-fA-F0-9]{1,6})"))
            return true;
        return false;
    }

    public static void main(String[] args) {
        System.out.println(isValidHexCod("#Eae5e6"));
    }
}
