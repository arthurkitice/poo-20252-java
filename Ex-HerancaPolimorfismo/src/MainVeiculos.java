import exe0.Caminhao;
import exe0.Carro;
import exe0.Moto;
import exe0.Veiculo;

import java.util.ArrayList;
import java.util.List;

public class MainVeiculos {

    //Metodo estático exibir
    public static void exibir(Veiculo veiculo){
        System.out.println(veiculo.toString());
    }

    public static void main(String[] args) {

        //Veículos
        Carro car1 = new Carro("ESA1F34", "Palio", 45000, 6);
        Moto mot1 = new Moto("FJB", "CG Titan", 50000, 160);
        Caminhao cam1 = new Caminhao("PWM3498", "FH 540", 120000, 6);

        //Usando o metodo estático
        exibir(car1);
        exibir(mot1);
        exibir(cam1);

        //Lista com os veículos
        List<Veiculo> listaVeiculos = new ArrayList<>();
        listaVeiculos.add(car1);
        listaVeiculos.add(mot1);
        listaVeiculos.add(cam1);

        double somaImposto = 0;

        //Percorre a lista e calcula a soma dos impostos
        for(Veiculo veiculo: listaVeiculos){
            somaImposto += veiculo.calcularImposto();
        }

        System.out.println("Valor total dos impostos: " + Math.round(somaImposto * 100.0) / 100.0 + "R$");
    }
}