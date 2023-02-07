
package exerciciosintaxe.exerciciosintaxe;

import java.util.Scanner;

public class App {
    

    public static void main(String[] args) {
        
        int anoFabricacao = 0;
        float valorCarro = 0.0f;
        float porcentagemDesconto = 0.0f;
        float valorDesconto = 0.0f;

        Scanner leitor = new Scanner(System.in);

        boolean desejaRepetir = true;

        while (desejaRepetir == true) {

            System.out.println("Digite o ano de fabricação do veículo: ");
            anoFabricacao = leitor.nextInt();

            System.out.println("Digite o valor do veículo: ");
            valorCarro = leitor.nextFloat();
        }
        
        if (anoFabricacao <= 2000) {
            //12% desconto
            porcentagemDesconto = 0.012f;
        } else {
            porcentagemDesconto = 0.007f;
        }

        valorDesconto = valorCarro * porcentagemDesconto;
            
        System.out.println("Deseja fazer mais cadastros? S - Sim / N - Não" );

    }
}
