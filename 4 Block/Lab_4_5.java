public class Lab_4_5 {
    public static String BMI(String S1, String S2) {
        double V = Double.parseDouble(S1.substring(0, S1.indexOf(' '))); // выводит подстроку с индекса по индекс
        if (S1.endsWith("pounds")) {                                     // проверяет, заканчивается ли эта строка указанным окончанием.
            V = V * 0.453592;
        }
        double R = Double.parseDouble(S2.substring(0, S2.indexOf(' ')));
        if (S2.endsWith("inches")) {
            R = R * 0.0254;
        }
        double IBM = V / Math.pow(R, 2);
        if (IBM < 18.5) {
            return String.format("%.1f", IBM) + " mini Ves";
        }
        else if(IBM<24.9)
            return String.format("%.1f", IBM)+ " Norm Ves";
        else
            return String.format("%.1f", IBM)+ " Big Ves";

    }

    public static void main(String[] args) {
        System.out.println(BMI("205 pounds", "73 inches"));
        System.out.println(BMI("55 kilos", "1.65 meters"));
        System.out.println(BMI("154 pounds", "2 meters"));
    }
}
