package heranca;

import java.util.Date;

public class Funcionario {
    private String nome;
    private String cpf;
    private Date dataNascimento;
    private float salario;

    public Funcionario() {

    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String string) {
        this.nome = nome;
    }

    public String getCpf(String string) {
        return cpf;
    }

    public void setCpf(String string) {
        this.cpf = cpf;
    }

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Date date) {
        this.dataNascimento = dataNascimento;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float f) {
        this.salario = salario;
    }
}
