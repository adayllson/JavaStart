
package classes;

import java.util.Scanner;

public class Principal {

    
    public static void main(String[] args) {
        
        Pessoa objetPessoa = new Pessoa(70.0f, 1.80f);

        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite o peso da pessoa: ");
        objetPessoa.setPeso(leitor.nextFloat());
        
        System.out.println("Digite a altura da pessoa: ");
        objetPessoa.setAltura(leitor.nextFloat());

        System.out.println("IMC = " + objetPessoa.calcularIMC());
    }
}