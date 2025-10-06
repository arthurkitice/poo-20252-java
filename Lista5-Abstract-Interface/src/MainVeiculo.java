import ex3.CarroEletrico;
import ex3.PatineteEletrico;
import ex3.Veiculo;
import ex3.Eletrico;

import java.util.ArrayList;
import java.util.List;

public class MainVeiculo {
    public static void main(String[] args) {
        CarroEletrico car1 = new CarroEletrico("Tesla");
        CarroEletrico car2 = new CarroEletrico("BYD");
        PatineteEletrico pat1 = new PatineteEletrico("Patinete 1");
        PatineteEletrico pat2 = new PatineteEletrico("Patinete 2");

        List<Veiculo> lista1 = new ArrayList<>();
        lista1.add(car1);
        lista1.add(car2);
        lista1.add(pat1);
        lista1.add(pat2);

        for(Veiculo veic : lista1) {
            veic.mover();
            // cast é para conversão de tipos primitivos
            // coerção é para conversão de objetos
            Eletrico aux = (Eletrico) veic; // Poderia ser feito assim também -> ((Eletrico) veic).carregarBateria();
            aux.carregarBateria();
        }
    }
}
