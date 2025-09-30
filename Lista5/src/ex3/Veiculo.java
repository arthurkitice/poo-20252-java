package ex3;

public abstract class Veiculo {
    protected String modelo;

    public Veiculo() {
    }

    public Veiculo(String modelo) {
        this.modelo = modelo;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public abstract void mover();

    public void exibirModelo(){
        System.out.println("Modelo do veículo: " + this.modelo);
    }
}
