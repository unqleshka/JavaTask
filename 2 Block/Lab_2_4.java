public class Lab_2_4 {
    public static void cumulativeSum(int[] a)
    {
       
        for(int i = 1;i<a.length;i++){
             a[i]=a[i] + a[i-1];
        }
        System.out.println(a);            
    }
    public static void main(String[] args)
        {
            int[] i = {3,4,5};
            cumulativeSum(i);
        }
}
