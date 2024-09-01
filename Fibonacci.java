class Fibonacci {
    public static void main(String[] args) {
        int num = 6;
        System.out.println(verificaNumeroEmFibonacci(10, num)); // o Primeiro parâmetro serve para indicar o tamanho da sequência de Fibonacci, o segundo é o número que eu quero verificar se está dentro de Fibonacci
    }

    public static boolean verificaNumeroEmFibonacci(int a, int b) {
        int[] soma = fibonacci(a);
        boolean verifica = false;
        for(int i = 0; i < a; i++) {
            if(b==soma[i]){
                verifica = true;
                break;
            }
        }
        return verifica;
    }

    public static int[] fibonacci(int a) {
        int[] soma = new int[a];
        soma[0] = 0;
        soma[1] = 1;
        for(int i = 2; i<a; i++) {
            soma[i] = soma[i-1] + soma[i-2];
        }
        return soma;
    }
}
