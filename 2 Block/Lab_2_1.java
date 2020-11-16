public class Lab_2_1 {
    public static String repeat(String a,int b)
    {
        char [] symb = new char[a.length()];
        a.getChars(0, a.length(), symb, 0);
        String rep = "";
        for(int i = 0;i<a.length();i++){
            for(int j =0;j<b;j++){
                rep=rep+symb[i];
            }
        }
      return rep;  
    }
    public static void main(String[] args)
        {
             System.out.println(repeat("melo",1));
        }
}
