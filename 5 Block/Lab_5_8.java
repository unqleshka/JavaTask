import java.security.MessageDigest;
public class Lab_5_8 {
    public static String bytesToHex(String S) {
        try{
            MessageDigest dig = MessageDigest.getInstance("SHA-256"); //параметр, передаваемый методу getInstance(), определяет используемый алгоритм дайджеста конкретного сообщения
            byte[] hesh = dig.digest(S.getBytes("UTF-8"));
            StringBuffer hexStr = new StringBuffer();//изменяемый класс
            for (int i = 0; i < hesh.length; i++) {
                String hexS = Integer.toHexString(0xff & hesh[i]);
                if(hexS.length() == 1)
                    hexStr.append('0'); // обновляет значение объекта
                hexStr.append(hexS);
            }
            return hexStr.toString();
        } catch(Exception exc){
           throw new RuntimeException(exc);
        }
    }
    public static void main(String[] A) {
        System.out.println(bytesToHex("Fluffy@home"));
    }
}
