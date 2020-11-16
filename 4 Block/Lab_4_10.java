public class Lab_4_10 {
    public static int countUniqueBooks(String S, char C) {
        String S1 = "";
        String S2 = "";
        String F = "";
        int I1 = 0, I2 = 0;
        while(S.length()!= 0)
        {
            if(S.indexOf(C)!=-1) // возвращает индекс в данной строке первого вхождения
            {
                S1 = S.substring(S.indexOf(C)+1);  // возвращает подстраку от индекса до индекса
                I1 = S.indexOf(C)+1;
                S = S.substring(I1);
            }
            if(S1.indexOf(C)!=-1)
            {
                S2 = S1.substring(0,S1.indexOf(C));
                I2 =S1.indexOf(C)+1;
                S = S.substring(I2);
            }
            for(int i=0;i<S2.length();i++)
            {
                if(F.indexOf(S2.charAt(i))==-1)
                {
                    F += S2.charAt(i);
                }
            }
        }
        return F.length();
    }
    public static void main(String[] A) {
        System.out.println(countUniqueBooks("ARTABGVAERFA", 'A'));
    }
}
