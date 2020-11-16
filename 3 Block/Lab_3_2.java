public class Lab_3_2 {
    public static int findZip(String S) {
        char arr[] = S.toCharArray();
        int Sum = 0;
        int indx = 0;
        for (int i = 0; i < S.length(); i++) {
            if (arr[i] == 'z' && arr[i + 1] == 'i' && arr[i + 2] == 'p') {
                Sum += 1;
                if (Sum == 2) {
                    indx = i + 1;
                    break;
                } else
                    i = i + 2;
            }
        }
        if (Sum > 1)
            return indx;
        else
            return -1;
    }

    public static void main(String[] A) {
        System.out.println(findZip("zip  asd adzip zooadpzip"));
    }
}
