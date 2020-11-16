public class Lab_6_8 {
    public static String convertToRoman(int X) {
        if (X > 3999 && X <= 0)
            return "invailed";
        String res = "";
        while (X >= 1000) {
            X -= 1000;
            res += "M";
        }
        if (X >= 900) {
            X -= 900;
            res += "CM";
        }
        if (X >= 500) {
            X -= 500;
            res += "D";
        }
        if (X >= 400) {
            X -= 400;
            res += "CD";
        }
        while (X >= 100) {
            X -= 100;
            res += "C";
        }
        if (X >= 90) {
            X -= 90;
            res += "XC";
        }
        if (X >= 50) {
            X -= 50;
            res += "L";
        }
        if (X >= 40) {
            X -= 40;
            res += "XL";
        }
        while (X >= 10) {
            X -= 10;
            res += "X";
        }
        if (X == 9) {
            X -= 9;
            res += "IX";
        }
        if (X >= 5) {
            X -= 5;
            res += "V";
        }
        if (X == 4) {
            X -= 4;
            res += "IV";
        }
        while (X >= 1) {
            X -= 1;
            res += "I";
        }
        return res;
    }

    public static void main(String[] A) {
        System.out.println(convertToRoman(98));
    }
}
