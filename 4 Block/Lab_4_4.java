public class Lab_4_4 {
    public static String overTime(double a, double b, double c, double d) {
        String Baks = "$";
        double S = 0;
        if (b > 17) {
            S = b - 17;
            S = (b - a - S) * c + (S * 30 * d);
        } else {
            S = (b - a) * c;
        }
        return Baks + String.format("%.2f", S); // в строку вещественное число: double
    }

    public static void main(String[] A) {
        System.out.println(overTime(14, 17, 30, 1.5));
    }
}
