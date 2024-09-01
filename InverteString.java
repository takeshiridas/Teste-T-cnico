import java.util.Arrays;

public class InverteString {
    public static void main(String[] args) {
        System.out.println(inverteString("batatat"));
    }

    static String inverteString(String x) {
        char[] cortaString = x.toCharArray();
        char[] novaString = new char[cortaString.length];
        for(int i = 0, j = cortaString.length - 1; i<cortaString.length; i++, j--){
            novaString[i] = cortaString[j];
        }

        return new String(novaString);
    }
}
