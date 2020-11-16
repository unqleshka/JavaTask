public class Lab_6_5 {
    public static String getHashTags(String S) {
        String NS2 = S;
        String NS3 = "";
        while (NS2.length() >= 1) {
            if (NS2.matches("^(?i:[bcdfghjklmnpqrstvwxyz ]).*") == true || 
                NS2.matches("^(?i:[aeiouy ]).*") == true) {
                NS3 += NS2.charAt(0);
            }
            NS2 = NS2.substring(1);
        }
        NS2 = NS3.toLowerCase()+" ";
        String NS = "";
        String[] mas = { "", "", "" };
        while (NS2.length() > 1) {
            NS = NS2.substring(0, NS2.indexOf(" "));
            NS2 = NS2.substring(NS2.indexOf(" ") + 1);
            if (NS.length() > mas[0].length()) {
                mas[0] = NS;
            }
        }
        NS2 = NS3.toLowerCase()+" ";
        while (NS2.length() > 1) {
            NS = NS2.substring(0, NS2.indexOf(" "));
            NS2 = NS2.substring(NS2.indexOf(" ") + 1);
            if (NS.length() > mas[1].length() && 
                NS.equals(mas[0]) == false) {
                mas[1] = NS;
            }
        }
        NS2 = NS3.toLowerCase()+" ";
        while (NS2.length() > 1) {
            NS = NS2.substring(0, NS2.indexOf(" "));
            NS2 = NS2.substring(NS2.indexOf(" ") + 1);
            if (NS.length() > mas[2].length() && NS.equals(mas[0]) == false && NS.equals(mas[1]) == false) {
                mas[2] = NS;
            }
        }
        if (mas[0].equals(""))
            return "";
        if (mas[1].equals(""))
            return "['#" + mas[0] + "']";
        if (mas[2].equals(""))
            return "['#" + mas[0] + "', '#" + mas[1] + "']";
        return "['#" + mas[0] + "', '#" + mas[1] + "', '#" + mas[2] + "']";
    }

    public static void main(String[] A) {
        System.out.println(getHashTags("Hey Parents, Surprise, Fruit Juice Is Not Fruit"));
    }
}
