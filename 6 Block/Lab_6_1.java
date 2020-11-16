public class Lab_6_1 {
    public static int bell(int X) {
        int[][] B = new int[X + 1][X + 1];
        B[0][0] = 1;
        for (int i = 1; i <= X; i++) {
            B[i][0] = B[i - 1][i - 1];
            for (int j = 1; j <= i; j++) {
                B[i][j] = B[i-1][j-1]+B[i][j-1];
            }
        }
        return B[X][0];
    }

    public static void main(String[] A) {
        System.out.println(bell(3));
    }
}
