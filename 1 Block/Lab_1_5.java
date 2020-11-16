public class Lab_1_5 {
    public static String operation(int N,int a,int b)
    {
        if (a+b==N)
        return "Plus";
        else if(a-b==N)
        return "Minus"; 
        else if(a*b==N)
        return "Umnojit";
        else if (a/b==N)
        return "delit";
        else 
        return "none"; 
    }
        public static void main(String[] args)
        {
             System.out.println(operation(6, 2,3));
        }
    
}
