public class Lab_1_4 {
    public static boolean profitableGamble(int prob,int prize,int pay)
    {
        if (prob*prize>pay)
        return true;
        else 
        return false; 
    }
        public static void main(String[] args)
        {
             System.out.println(profitableGamble(5, 6,2));
        }
    }