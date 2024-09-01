package org.example;

import com.google.gson.Gson;
import com.google.gson.stream.JsonReader;
import java.io.FileReader;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Gson gson = new Gson();

        try (JsonReader reader = new JsonReader(new FileReader("src/main/resources/faturamento.json"))) {
            FaturamentoMensal faturamentoMensal = gson.fromJson(reader, FaturamentoMensal.class);
            List<Dia> dias = faturamentoMensal.getFaturamento();

            // Implementar a lógica para calcular o menor, maior e dias acima da média
            calcularEstatisticas(dias);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static void calcularEstatisticas(List<Dia> dias) {
        double menorValor = Double.MAX_VALUE;
        double maiorValor = Double.MIN_VALUE;
        double soma = 0.0;
        int diasComFaturamento = 0;

        for (Dia dia : dias) {
            if (dia.getValor() > 0) {
                if (dia.getValor() < menorValor) {
                    menorValor = dia.getValor();
                }
                if (dia.getValor() > maiorValor) {
                    maiorValor = dia.getValor();
                }
                soma += dia.getValor();
                diasComFaturamento++;
            }
        }

        double media = soma / diasComFaturamento;
        int diasAcimaDaMedia = 0;

        for (Dia dia : dias) {
            if (dia.getValor() > media) {
                diasAcimaDaMedia++;
            }
        }

        System.out.println("Menor valor: " + menorValor);
        System.out.println("Maior valor: " + maiorValor);
        System.out.println("Dias acima da média: " + diasAcimaDaMedia);
    }
}
