public class Lab_3_9 {
    public static int nextPrime(int X) {
        for (int i = 2; i < X; i++) {
            if (X % i == 0) {
                i = 2;
                X=X+1;
            }
        }
        return X;
    }

    public static void main(String[] A) {
        System.out.println(nextPrime(14));
    }
}
