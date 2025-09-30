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
        }

        List<Eletrico> lista2 = new ArrayList<>();
        lista2.add(car1);
        lista2.add(car2);
        lista2.add(pat1);
        lista2.add(pat2);

        for(Eletrico veic : lista2) {
            veic.carregarBateria();
        }

    }
}
