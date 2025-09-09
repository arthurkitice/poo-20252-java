package exe0;

//Classe pai
public class Funcionario {
    //Variáveis protegidas -> Só podem ser acessadas internamente e por classes filhas
    protected String nome, endereco, cpf;
    protected double salario;

    public Funcionario() {
    }

    public Funcionario(String nome, String endereco, String cpf, double salario) {
        this.nome = nome;
        this.endereco = endereco;
        this.cpf = cpf;
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public double calculaSalario(){
        return this.salario;
    }

    @Override
    public String toString() {
        return "Funcionario{" +
                "nome='" + nome + '\'' +
                ", endereco='" + endereco + '\'' +
                ", cpf='" + cpf + '\'' +
                ", salario=" + this.calculaSalario() +
                '}';
    }
}
