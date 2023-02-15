/*
 * A concessionária de veículos “CARANGO VELHO” está vendendo os seus veículos com desconto. 
 * Faça um algoritmo que calcule e exiba o valor do desconto e o valor a ser pago pelo cliente de vários carros. 
 * O desconto deverá ser calculado de acordo com o ano do veículo. Até 2000 - 12% e acima de 2000 - 7%. 
 * O sistema deverá perguntar se deseja continuar calculando desconto até que a resposta seja: “(N) Não”. 
 * Informar total de carros com ano até 2000 e total geral;
 */
package exerciciosintaxe.exerciciosintaxe;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        int anoFabricacao = 0;
        float valorCarro = 0.0f;
        float porcentagemDesconto = 0.0f;
        float valorDesconto = 0.0f;
        float valorPagar = 0.0f;

        int totalCarrosSemiNovos = 0;
        int totalCarros = 0;

        Scanner leitor = new Scanner(System.in);

        char desejaRepetir = 's';

        while (desejaRepetir == 's' || desejaRepetir == 'S') {

            System.out.println("Digite o ano de fabricação do veículo: ");
            anoFabricacao = leitor.nextInt();

            System.out.println("Digite o valor do veículo: ");
            valorCarro = leitor.nextFloat();

            if (anoFabricacao <= 2000) {
                // 12% desconto
                porcentagemDesconto = 0.12f;
            } else {
                porcentagemDesconto = 0.07f;
                totalCarrosSemiNovos++;
            }
            totalCarros++;

            valorDesconto = valorCarro * porcentagemDesconto;
            valorPagar = valorCarro - porcentagemDesconto;

            System.out.println("Deseja fazer mais cadastros? S - Sim / N - Não");
            desejaRepetir = leitor.next().charAt(0);
        }

        System.out.println("Total de carros semi novos: " + totalCarrosSemiNovos);
        System.out.println("Total de carros: " + totalCarros);
    }

}
