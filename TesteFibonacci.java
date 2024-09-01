import java.util.Arrays;

public class TesteFibonacci {
    public static void main(String[] args) {
        fibonacci(5);
    }
    public static void fibonacci(int a) {
        int[] soma = new int[a];
        soma[0] = 0;
        soma[1] = 1;
        for(int i = 2; i<a; i++) {
            soma[i] = soma[i-1] + soma[i-2];
        }
        System.out.println(Arrays.toString(soma));
    }
}
