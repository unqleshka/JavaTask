import java.util.ArrayList;
public class Lab_6_4 {
    public static String stripUrlParams (String S, String... A) {
        int i = S.indexOf("?");
        String BP = "", BN = "", res;
        if (i == -1)
            return S;
        i++;
        res = S.substring(0, i);
        Boolean boolPar = true, inArgs;
        ArrayList<String> params = new ArrayList<>(A.length);
        ArrayList<Integer> values = new ArrayList<>(A.length);
        while (i<S.length()) {
            if (S.charAt(i) == '&' && BN.length() > 0 && !boolPar) {
                if (params.indexOf(BP) != -1)
                    values.set((params.indexOf(BP)), Integer.parseInt(BN));
                boolPar = true;
                BP = "";
                BN = "";
            }
            else
                if (!boolPar)
                    BN += S.charAt(i);
            if (S.charAt(i) == '=' &&
                BP.length() > 0 && 
                boolPar) {
                if (params.indexOf(BP) == -1) {
                    inArgs = false;
                    for (String j:A)
                        if (j.equals(BP))
                            inArgs = true;
                    if (!inArgs) {
                        params.add(BP);
                        values.add(null);
                    }
                }
                boolPar = false;
            }
            else
                if (boolPar && S.charAt(i) != '&')
                    BP += S.charAt(i);
            i++;
        }
        if (!boolPar && BN.length() > 0) // for last
            if (params.indexOf(BP) != -1)
                values.set((params.indexOf(BP)), Integer.parseInt(BN));
        for (i=0; i<params.size(); i++) {
            res += params.get(i) + "=" + values.get(i);
            if (i<params.size() - 1)
                res += "&";
        }
        return res;

    }
    public static void main(String[] A) {
        String[] extraOpt = {"b"};
        System.out.println(stripUrlParams("https://edabit.com?a=3&c=4&a=5&a=4&b=8&c=5", extraOpt));
    }
}
