public class Lab_1_3 {
    public static int animals(int a, int b, int c)
    {
    int  chickens = 2;
    int  cows = 4;
    int  pigs = 4;
    return a*chickens+b*cows+c*pigs;
    }
        public static void main(String[] args)
        {
             System.out.println(animals(5, 6,2));
        }
    }