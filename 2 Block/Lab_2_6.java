public class Lab_2_6 {
    public static int Fibonacci(int z)
    {
        int a = 1, b = 1 ,c;
        for (int i = 2; i <= z; ++i) {
            c = a + b;
            a = b;
            b = c;
        }
        return b;       
    }
    public static void main(String[] args)
        {
            System.out.println(Fibonacci(7));
        }
}