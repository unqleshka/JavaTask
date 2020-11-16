public class Lab_2_3 {
    public static boolean isAvgWhole(int[] a)
    {
        double sr = 0;
        for(int i = 0;i<a.length;i++){
            sr = sr + a[i];
        }
        sr = sr / a.length;
        if ( sr ==(int)sr)
            return  true;  
        else 
            return false;
    }
    public static void main(String[] args)
        {
            int[] i = {3,2,5};
             System.out.println(isAvgWhole(i));
        }
}
