public class Lab_2_2 {
    public static int differenceMaxMin(int[] a)
    {
        int min = a[0], max = a[0];
        for(int i = 1;i<a.length;i++){
            if ( min > a[i])
            min = a[i] ;
            if  ( max < a[i])
            max = a[i];
        }
      return max - min ;  
    }
    public static void main(String[] args)
        {
            int[] i = {1,3,5};
             System.out.println(differenceMaxMin(i));
        }
}
