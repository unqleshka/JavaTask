public class Lab_3_3 {
    public static boolean checkPerfec(int k) {
        int Sum = 0;
        for (int i = 1; i < k; i++)
        {
            if (k % i == 0)
                Sum += i;
        }
        if(Sum == k)
            return true;
        else
            return false;
    }

    public static void main(String[] A) {
        System.out.println(checkPerfec(1488));
    }
}
