package exe0;

public class Carro extends Veiculo {
    private int portas;

    public Carro() {
        super();
    }

    public Carro(String placa, String modelo, double valorBase, int portas) {
        super(placa, modelo, valorBase);
        this.portas = portas;
    }

    public int getPortas() {
        return portas;
    }

    public void setPortas(int portas) {
        this.portas = portas;
    }

    @Override
    public double calcularImposto(){
        return valorBase * 0.03f;
    }

    @Override
    public String toString() {
        return "Carro{" +
                "portas=" + portas + '\'' + super.toString() +
                '}';
    }
}
