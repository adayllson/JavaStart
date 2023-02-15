
package heranca.heranca;

import java.util.Date;

public class App {
    
    public static void main(String[] args) {

        Vendedor v = new Vendedor();
        v.setNome("Adailson");
        v.setCpf("03248612142");
        v.setSalario(1000.0f);
        v.setDataNascimento(new Date());
        v.setComissaoPorItem(10.0f);
        v.setTotalItensVendidos(10);

        System.out.println("O salário do vendedor é: " + v.calcularSalario());
        
        Motorista m = new Motorista();
        

       
    }
}
