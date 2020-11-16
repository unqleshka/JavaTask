public class Lab_2_5 {
    public static int getDecimalPlaces(String S)
    {
        int index = S.indexOf(".");
        if (index ==-1)
            return 0;
        else  
        {
            S = S.substring(index +1, S.length());
            return S.length();
        }         
    }
    public static void main(String[] args)
        {
            System.out.println(getDecimalPlaces("1010.03301"));
        }
}
