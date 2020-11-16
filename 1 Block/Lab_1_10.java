public class Lab_1_10 {
    public static boolean abcmath (int a,int b,int c)
    {
        int d = (int) Math.pow(2,b) ;
        if (a * d % c == 0){
            return true;
              }
else 
        return false;
    }
    public static void main(String[] args)
        {
             System.out.println(abcmath(5,2,1));
        }
}
