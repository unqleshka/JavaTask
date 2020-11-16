public class Lab_3_1 {
    public static int solutions(int a, int b, int c) {
        double Discr = Math.pow(b, 2) - 4 * a * c;
        if (Discr < 0)
            return 0;
        else if (Discr == 0)
            return 1;
        else
            return 2;
    }

    public static void main(String[] S) {
        System.out.println(solutions(1, 0, 0));
    }
}
