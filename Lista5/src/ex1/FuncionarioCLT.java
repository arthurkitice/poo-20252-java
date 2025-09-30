package ex1;

public class FuncionarioCLT extends Funcionario{

    public FuncionarioCLT() {
        super();
    }

    public FuncionarioCLT(String nome, double salarioBase) {
        super(nome, salarioBase);
    }

    @Override
    public double calcularSalario(){
        return this.salarioBase*1.1;
    }
}
