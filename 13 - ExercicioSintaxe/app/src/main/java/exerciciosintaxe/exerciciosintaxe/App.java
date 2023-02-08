
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
        }

        if (anoFabricacao <= 2000) {
            //12% desconto
            porcentagemDesconto = 0.12f;
        } else {
            porcentagemDesconto = 0.07f;
            totalCarrosSemiNovos++;
        }
        totalCarros++;

        valorDesconto = valorCarro * porcentagemDesconto;
        valorPagar = valorCarro - porcentagemDesconto;

        System.out.println("Deseja fazer mais cadastros? S - Sim / N - Não");25
        desejaRepetir = leitor.next().charAt(0);
        
        System.out.println("Total de carros semi novos: " + totalCarrosSemiNovos);
        System.out.println("Total de carros: " + totalCarros);
    }
    
    
}
