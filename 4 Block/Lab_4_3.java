
    public class Lab_4_3 {
        public static String toCamelCase(String S) {
            char[] NS = S.toCharArray(); // из строки массив чаров
            S = "";
            for (int i = 0; i < NS.length; i++) {
                if (NS[i] == '_')
                    NS[i + 1] = Character.toUpperCase(NS[i + 1]); //  возвращает в верхнем регистре
                else
                    S += NS[i];
            }
            return S;
        }
    
        public static String toSnakeCase(String S) {
            char[] NS = S.toCharArray(); // из строки массив чаров
            S = "";
            for (int i = 0; i < NS.length; i++) {
                if (Character.isUpperCase(NS[i])) {  
                    S += "_" + Character.toLowerCase(NS[i]); // возвращает в нижний регистр
                } else
                    S += NS[i];
            }
            return S;
        }
    
        public static void main(String[] A) {
            System.out.println(toCamelCase("is_modal_open"));
            System.out.println(toSnakeCase("helloEdabitBruh"));
        }
    }
