public class Lab_4_7 {
    public static String toStarShorthand(String S) {
        if(S=="")
            return "";
        char save = S.charAt(0); // возвращает символ, расположенный по указанному индексу строки.
        int K = 1;
        String N = "";
        for(int i=1;i<S.length();i++)
        {
            if(S.charAt(i) != save) // возвращает символ, расположенный по указанному индексу строки.
            {
                if(K>1)
                {
                    N += ""+save+ "*"+ K;
                }
                else
                    N += ""+save;
                K = 1;
                if(i!=S.length()-1)
                    save = S.charAt(i); 
                else
                    N+=S.charAt(i);
            }
            else
            {
                K++;
                if(i== S.length()-1)
                {
                    N += ""+save+ "*"+ K;
                }
            }
        }
        return N;
    }
    public static void main(String[] A) {
        System.out.println(toStarShorthand("aabbbcdd"));
    }
}