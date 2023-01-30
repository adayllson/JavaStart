package estruturawhile;

import java.util.Scanner;

public class App {
    public String getGreeting() {
        return "Hello World!";
    }

    public static void main(String[] args) {

        int totalAlunos = 10;
        int idadeAluno;
        String nomeAluno;

        leitorScanner = new Scanner(System.in);
        System.out.println("Digite o nome do aluno: ");
        nomeAluno = leitorScanner.nextLine();

        System.out.println("Digite a idade: ");
        idadeAluno = leitorScanner.nextInt();

        while (totalAlunos > 0) {

            System.out.println("O nome do aluno é: " + nomeAluno + "e sua idade é: " + idadeAluno);

            totalAlunos = totalAlunos - 1;
        }
    }
}
