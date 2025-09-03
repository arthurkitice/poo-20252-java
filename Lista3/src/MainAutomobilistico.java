//Agregação e composição 2
import exe0.Carro;
import exe0.Motor;

public class MainAutomobilistico {
    public static void main(String[] args) {
        //Não pode acontecer, regra de negócio ~> Motor mot1 = new Motor(130, true);
        //Não pode acontecer, parâmetro inválido ~> Carro car1 = new Carro("Onix", mot1);
        Carro car1 = new Carro("Onix", 130, true);

        System.out.println(car1.toString());
    }
}
