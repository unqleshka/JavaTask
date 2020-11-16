public class Lab_5_10 {
    public static String hexLattice(int N) {
        String R = "";
        int q, i, j;
        double x = 1 / 2.0 + 1 / 6.0 * Math.sqrt(12.0 * N - 3); // hexagonal formula
        if (Math.ceil(x) == Math.floor(x)) { // Округление в большую сторону == в меньшую сторонуcheck integer
            q = (int) x;
            for (i = 0; i < q; i++) { // each string to half
                for (j = 0; j < q - i; j++) // ДО пробела
                    R += " ";
                for (j = 0; j < q + i; j++) // буква О
                    R += "o ";
                for (j = 0; j < q - i - 1; j++) // после пробела
                    R += " ";
                R += "\n"; // след строка
            }
            for (i = q - 2; i >= 0; i--) { // each string from half+1 to end
                for (j = 0; j < q - i; j++) // ДО пробела
                    R += " ";
                for (j = 0; j < q + i; j++) // буква О
                    R += "o ";
                for (j = 0; j < q - i - 1; j++) // после пробела
                    R += " ";
                R += "\n"; //  след строка
            }
        } else
            R = "Invalid";
        return R;
    }

    public static void main(String[] A) {
        System.out.println(hexLattice(37));
    }
}
