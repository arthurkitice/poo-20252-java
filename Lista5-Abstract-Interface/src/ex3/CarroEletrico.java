package ex3;

public class CarroEletrico extends Veiculo implements Eletrico{
    public CarroEletrico() {
    }

    public CarroEletrico(String modelo) {
        super(modelo);
    }

    @Override
    public void carregarBateria(){
        System.out.println("Carregando a bateria do carro elétrico...");
    }

    @Override
    public void mover(){
        System.out.println("O carro elétrico modelo " + this.modelo + " está se movendo.");
    }
}
