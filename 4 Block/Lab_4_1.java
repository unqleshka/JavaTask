public class Lab_4_1 {
    public static String nextPrime(int n, int k, String S) {
        String NS = "";
        String S2 = "";
        int sum = 0;
        int sum2 = 0;
        for (int i = 0; i < S.length(); i++) {
            sum++;
            if (S.charAt(i) == ' ') { // возвращает символ, расположенный по указанному индексу строки.
                S2 = S.substring(i); // возвращает подстраку от индекса до индекса
                sum2 = S2.split("\\ ")[1].length(); // разделяет строку вокруг выражения (делает пробел)
                sum--;
            }
            if (sum+sum2<= k) {
                sum2=0;
                NS += S.charAt(i);
            } else if(S.charAt(i) != ' '){
                NS += "\n" + S.charAt(i);
                sum = 0;
            }
        }
        return NS;

    }

    public static void main(String[] A) {
        System.out.println(nextPrime(10, 7, "hello my name is Bessie and this is my essay"));
    }
}
