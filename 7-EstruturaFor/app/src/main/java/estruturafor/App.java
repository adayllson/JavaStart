package estruturafor;

public class App {
    public String getGreeting() {
        return "Hello World!";
    }

    public static void main(String[] args) {
        
        /*
         * Estrutura for é composta por três partes:
         * Variável de controle (int i = 0;)
         * Condição de parada (i <= 10;)
         * Incremento ( i++)
         */
        for (int i = 0; i <= 10; i++) {
            
            System.out.println("Número - " + i);
        }
    }
}
