public class Lab_1_9 {
    public static int sumOfCubes (int a,int b,int c)
    {
        return (int) (Math.pow(a,3)+Math.pow(b,3)+Math.pow(c,3));
    }
    public static void main(String[] args)
        {
             System.out.println(sumOfCubes(1,5,9));
        }
}
