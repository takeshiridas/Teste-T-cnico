public class Distribuidora {
    public static void main(String[] args) {
        final double SP = 67_836.43;
        final double RJ = 6_678.66;
        final double MG = 29_229.88;
        final double ES = 27_165.48;
        final double OUTROS = 19_849.53;

        final double total = OUTROS+ES+MG+RJ+SP;

        double porcentagemSP = calculaPercentual(total, SP);
        double porcentagemRJ = calculaPercentual(total, RJ);
        double porcentagemMG = calculaPercentual(total, MG);
        double porcentagemES = calculaPercentual(total, ES);
        double porcentagemOUTROS = calculaPercentual(total, OUTROS);

        System.out.printf("Percentual SP: %.2f%%%n", porcentagemSP);
        System.out.printf("Percentual RJ: %.2f%%%n", porcentagemRJ);
        System.out.printf("Percentual MG: %.2f%%%n", porcentagemMG);
        System.out.printf("Percentual ES: %.2f%%%n", porcentagemES);
        System.out.printf("Percentual Outros: %.2f%%%n", porcentagemOUTROS);
    }

    static double calculaPercentual(double tudo, double unidade) {
        double percentual = (unidade/tudo) * 100;
        return percentual;
    }
}
