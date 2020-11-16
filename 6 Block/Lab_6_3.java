public class Lab_6_3 {
    public static boolean validColor(String S) {
        if (S.matches(
                "^rgb\\((0|255|25[0-4]|2[0-4]\\d|1\\d\\d|0?\\d?\\d),(0|255|25[0-4]|2[0-4]\\d|1\\d\\d|0?\\d?\\d),(0|255|25[0-4]|2[0-4]\\d|1\\d\\d|0?\\d?\\d)\\)$") == true) {
            return true;
        } else if (S.matches(
                "^rgba[(](?:\\s*0*(?:\\d\\d?(?:\\.\\d+)?(?:\\s*%)?|\\.\\d+\\s*%|100(?:\\.0*)?\\s*%|(?:1\\d\\d|2[0-4]\\d|25[0-5])(?:\\.\\d+)?)\\s*,){3}\\s*0*(?:\\.\\d+|1(?:\\.0*)?)\\s*[)]$") == true) {
            return true;
        }
        return false;
    }

    public static void main(String[] A) {
        System.out.println(validColor("rgba(255,224,0,0.123456789)"));
    }
}
