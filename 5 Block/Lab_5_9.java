public class Lab_5_9 {
    public static String toCamelCase(String S) {
        S = S.toLowerCase(); //  все символы в данной строки в нижний регистр
        char[] NS = S.toCharArray(); // из строки массив
        NS[0] = Character.toUpperCase(NS[0]); // в вкрхний регистр
        S = "";
        for (int i = 0; i < NS.length; i++) {
            if (NS[i] == ' ' || NS[i] == '-') {
                if ((NS[i + 1] == 'i' && NS[i + 2] == 'n')
                        || (NS[i + 1] == 'a' && NS[i + 2] == 'n' && NS[i + 3] == 'd')
                        || (NS[i + 1] == 't' && NS[i + 2] == 'h' && NS[i + 3] == 'e')
                        || (NS[i + 1] == 'o' && NS[i + 2] == 'f')) {
                } else
                    NS[i + 1] = Character.toUpperCase(NS[i + 1]);
            }
            S += NS[i];
        }
        return S;
    }

    public static void main(String[] A) {
        System.out.println(toCamelCase("jOn SnoW, kINg IN thE noRth."));
    }
}
