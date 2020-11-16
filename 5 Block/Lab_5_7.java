public class Lab_5_7 {
    public static String numToEng(int N) {
        String R = "";
        String[] nums = new String[] { "", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine",
                "ten", "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen",
                "nineteen" };

        String[] deca = new String[] { "", "", "twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty",
                "ninety" };

        String hund = "hundred";
        if (N == 0)
            return "zero";
        if (N >= 100) {
            R += nums[N / 100] + " " + hund + " ";
        }
        if (N % 100 < 20 && N % 100 != 0)
            R += nums[N % 100];
        else
            R += deca[N % 100 / 10] + " " + nums[N % 10];
        return R;
    }

    public static void main(String[] A) {
        System.out.println(numToEng(488));
    }
}
