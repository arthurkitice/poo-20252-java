package ex3;

public class PatineteEletrico extends Veiculo implements Eletrico{
    public PatineteEletrico() {
    }

    public PatineteEletrico(String modelo) {
        super(modelo);
    }

    @Override
    public void carregarBateria(){
        System.out.println("Carregando a bateria do patinete elétrico...");
    }

    @Override
    public void mover(){
        System.out.println("O patinete elétrico modelo " + this.modelo + " está se movendo.");
    }
}
