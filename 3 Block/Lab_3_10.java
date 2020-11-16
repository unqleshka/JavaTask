public class Lab_3_10 {
    public static boolean rightTriangl(int l, int o, int h) {
        if (       Math.pow(l, 2) == Math.pow(o, 2) + Math.pow(h, 2) 
                || Math.pow(o, 2) == Math.pow(l, 2) + Math.pow(h, 2)
                || Math.pow(h, 2) == Math.pow(l, 2) + Math.pow(o, 2))
            return true;
        else
        return false;
    }

    public static void main(String[] A) {
        System.out.println(rightTriangl(10, 10, 100));
    }
}
