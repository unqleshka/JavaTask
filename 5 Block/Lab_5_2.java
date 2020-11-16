public class Lab_5_2 {
    public static boolean canMove(String F, String X1, String X2) {
        X1 = X1.toUpperCase();//  возвращает в верхнем регистре
        X2 = X2.toUpperCase();
        F = F.toUpperCase();
        if (X1.matches("([A-H]{1}[1-8]{1})") &&
            X2.matches("([A-H]{1}[1-8]{1})") && 
            X1.equals(X2) == false) { // сравнении объектов между собой
            if (F.equals("PAWN")) {
                if (X1.charAt(1) >= 50 && 
                    X1.charAt(1) <= 55 && 
                    X2.charAt(0) == X1.charAt(0) && 
                    (int) X2.charAt(1) == (int) X1.charAt(1) + 1)
                    return true;
                else
                    return false;
            }
            if (F.equals("ROOK")) {
                if (X2.charAt(0) == X1.charAt(0) ||
                    X2.charAt(1) == X1.charAt(1))
                    return true;
                else
                    return false;
            }
            if (F.equals("BISHOP")) {
                if (Math.abs((int) X2.charAt(0) - (int) X1.charAt(0)) == Math.abs(X2.charAt(1) - X1.charAt(1)))
                    return true;
                else
                    return false;
            }
            if (F.equals("QUEEN")) {
                if (X2.charAt(0) == X1.charAt(0) ||
                    X2.charAt(1) == X1.charAt(1) || Math
                        .abs((int) X2.charAt(0) - (int) X1.charAt(0)) == Math.abs(X2.charAt(1) - X1.charAt(1)))
                    return true;
                else
                    return false;
            }
            if (F.equals("KING")) {
                if (Math.abs((int) X2.charAt(0) - (int) X1.charAt(0)) <= 1
                        && Math.abs(X2.charAt(1) - X1.charAt(1)) <= 1)
                    return true;
                else
                    return false;
            }
            if (F.equals("HORSE")) {
                if (Math.abs((int) X2.charAt(0) - (int) X1.charAt(0)) == 1
                        && Math.abs(X2.charAt(1) - X1.charAt(1)) == 2
                        || Math.abs((int) X2.charAt(0) - (int) X1.charAt(0)) == 2
                        && Math.abs(X2.charAt(1) - X1.charAt(1)) == 1)
                    return true;
                else
                    return false;
            }
        }
        return false;
    }

    public static void main(String[] A) {
        System.out.println(canMove("horse", "A1", "B3"));
    }
}
