package exe0;

public class Veiculo {
    protected String placa, modelo;
    protected double valorBase;

    public Veiculo() {
    }

    public Veiculo(String placa, String modelo, double valorBase) {
        this.placa = placa;
        this.modelo = modelo;
        this.valorBase = valorBase;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public double getValorBase() {
        return valorBase;
    }

    public void setValorBase(double valorBase) {
        this.valorBase = valorBase;
    }

    public double calcularImposto(){
        return valorBase * 0.02f;
    }

    @Override
    public String toString() {
        return "Veiculo{" +
                "placa='" + placa + '\'' +
                ", modelo='" + modelo + '\'' +
                ", valorBase=" + valorBase +
                '}';
    }
}
