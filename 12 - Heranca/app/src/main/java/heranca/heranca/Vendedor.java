package heranca.heranca;

import java.util.Date;

public class Vendedor extends Funcionario {

    private int totalItensVendidos;
    private float comissaoPorItem;

    public Vendedor() {

        super();
    }

    /*
     * Atributo super(); indica que na herança da classe (Funcionario) a classe
     * atual (Vendedor)
     * terá tudos os atributos da classe (Funcionário).
     */
    public float calcularSalario() {
        return super.getSalario() + (this.comissaoPorItem * totalItensVendidos);
    }

    public int getTotalItensVendidos() {
        return totalItensVendidos;
    }

    public void setTotalItensVendidos(int i) {
        this.totalItensVendidos = totalItensVendidos;
    }

    public float getComissaoPorItem(float f) {
        return comissaoPorItem;
    }

    public void setComissaoPorItem(float f) {
        this.comissaoPorItem = comissaoPorItem;
    }

}
