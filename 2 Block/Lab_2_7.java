public class Lab_2_7 {
    public static boolean isValid(String S)
    {
        if (S.matches("\\d+") && S.length() == 5 )
        return true;

        else 
        return false;
    }   
    public static void main(String[] args) {
        System.out.println(isValid("00010"));
}
}