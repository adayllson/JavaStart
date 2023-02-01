
package exerciciofor;

import java.util.Scanner;

public class App {
    public String getGreeting() {
        return "Hello World!";
    }

    public static void main(String[] args) {
        
        String nomeProduto;
        float precoCusto, precoVenda, mediaCusto, mediaVenda;
        float totalCusto = 0.0f;
        float totalVenda = 0.0f;
       
        Scanner leitor = new Scanner(System.in);

        for(int i = 0; i < 40; i++){

            System.out.println("Digite o nome do produto: ");
            nomeProduto = leitor.nextLine();

            System.out.println("Digite o preço de custo do produto: ");
            precoCusto = leitor.nextFloat();

            System.out.println("Digite o preço de venda do produto: ");
            precoVenda = leitor.nextFloat();

            totalCusto = totalCusto + precoCusto;
            totalVenda = totalVenda + precoVenda;

            if(precoCusto == precoVenda){

                System.out.println("House empate entre o preço de custo e o preço de venda.");
            } else {
                if (precoCusto > precoVenda) {

                    System.out.println("Houve prejuízo.");
                } else {
                    System.out.println("Houve lucro.");
                }
            }
            
        }

    }
}
