package exe0;

public class Gerente extends Funcionario{
    private double bonus;

    public Gerente() {
        super();
    }

    public Gerente(String nome, String endereco, String cpf, double salario, double bonus) {
        super(nome, endereco, cpf, salario);
        this.bonus = bonus;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    @Override
    public double calculaSalario(){
        return super.calculaSalario() + this.bonus;
    }

    @Override
    public String toString() {
        return "Gerente{" +
                super.toString() + "bonus=" + bonus +
                '}';
    }
}
