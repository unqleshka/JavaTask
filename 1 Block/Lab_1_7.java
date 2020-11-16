public class Lab_1_7 {
    public static int addUpTo (int a)
    {
        int Sum=0;
        for (int i = 1;i <= a; i++)
        {
        Sum += i ;
        }
        return Sum;
    }
    public static void main(String[] args)
        {
             System.out.println(addUpTo(3));
        }
}
