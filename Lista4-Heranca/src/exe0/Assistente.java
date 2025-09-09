package exe0;

//Classe filha de Funcionario
//extends ~> Serve para definir a herança
public class Assistente extends Funcionario{
    private double horaExtra;

    public Assistente() {
        //Chama o construtor vazio da superclasse
        //Não é necessário caso o construtor vazio não tiver conteúdo
        super();
    }

    public Assistente(String nome, String endereco, String cpf, double salario, double horaExtra) {
        //O super chama o construtor da superclasse
        super(nome, endereco, cpf, salario);
        this.horaExtra = horaExtra;
    }

    @Override
    public double calculaSalario(){
        return (super.calculaSalario() + this.horaExtra * 50);
    }

    @Override
    public String toString() {
        //Super para chamar o toString da classe pai e concatenar com o da filha
        return "Assistente{" +
                super.toString() + "horaExtra=" + horaExtra +
                '}';
    }
}
