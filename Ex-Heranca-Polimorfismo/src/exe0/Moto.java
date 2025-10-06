package exe0;

public class Moto extends Veiculo {
    private int cilindradas;

    public Moto() {
        super();
    }

    public Moto(String placa, String modelo, double valorBase, int cilindradas) {
        super(placa, modelo, valorBase);
        this.cilindradas = cilindradas;
    }

    public int getCilindradas() {
        return cilindradas;
    }

    public void setCilindradas(int cilindradas) {
        this.cilindradas = cilindradas;
    }

    @Override
    public double calcularImposto(){
        return cilindradas <= 250 ? valorBase * 0.01f : valorBase * 0.02f;
    }

    @Override
    public String toString() {
        return "Moto{" +
                "cilindradas=" + cilindradas + '\'' + super.toString() +
                '}';
    }
}

