public class Lab_6_10 {
    public static boolean formula(int X) {
        String S = "" + X;
        int Z = 0;
        String NS1="";
        String NS2="";
        String NS3 = "";
        while (S.length() > 1) {
            if(S.length()%2!=0)
            {
                NS1 = S.substring(0,(int)S.length()/2+1);
                Z = NS1.length();
                while (Z!=0) 
                {
                    Z--;
                    NS2 += NS1.charAt(Z);
                }                
                if(NS2.equals(S.substring((int)S.length()/2)))
                    return true;
                else
                    return false;
            }
            else
            {
                NS1 = S.substring(0,S.length()/2);
                Z = NS1.length();
                while (Z!=0) 
                {
                    Z--;
                    NS2 += NS1.charAt(Z);
                }
                if(NS2.equals(S.substring((int)S.length()/2)))
                    return true;
                else
                {
                    for (int i=0; i<S.length(); i+=2) 
                    {
                        NS3 += Integer.toString(Integer.parseInt(S.substring(i,i+1)) + Integer.parseInt(S.substring(i+1,i+2)));
                    }
                    S = NS3;
                }
                NS1 = "";
                NS2 = "";
                NS3 = "";
                Z=0;
            }
        }
        return true;
    }
    public static void main(String[] args) {
    System.out.println(formula(123312));
    }
} 