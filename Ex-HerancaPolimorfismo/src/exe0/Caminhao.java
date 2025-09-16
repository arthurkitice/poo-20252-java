package exe0;

public class Caminhao extends Veiculo {
    private int eixos;

    public Caminhao() {
        super();
    }

    public Caminhao(String placa, String modelo, double valorBase, int eixos) {
        super(placa, modelo, valorBase);
        this.eixos = eixos;
    }

    public int getEixos() {
        return eixos;
    }

    public void setEixos(int eixos) {
        this.eixos = eixos;
    }

    @Override
    public double calcularImposto(){
        return valorBase * 0.04f + eixos * 500;
    }

    @Override
    public String toString() {
        return "Caminhao{" +
                "eixos=" + eixos + '\'' + super.toString() +
                '}';
    }
}


