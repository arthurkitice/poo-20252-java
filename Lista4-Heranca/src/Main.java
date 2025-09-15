import exe0.Assistente;
import exe0.Diretor;
import exe0.Gerente;

public class Main {
    public static void main(String[] args) {

        Assistente ass1 = new Assistente(
                "Pedro",
                "Franca",
                "123.456.789-00",
                2000,
                3);

        System.out.println(ass1.toString());
        System.out.println(ass1.calculaSalario());

        Gerente ger1 = new Gerente();

        ger1.setNome("Shamil");
        ger1.setEndereco("Ponta-Fina");
        ger1.setCpf("321.765.234-66");
        ger1.setSalario(5000);
        ger1.setBonus(1000);

        System.out.println(ger1.toString());
        System.out.println(ger1.calculaSalario());

        Diretor dir1 = new Diretor(
                "Guilherme",
                "Xique-Xique",
                "934.213.654-34",
                20000,
                500
        );

        System.out.println(dir1.toString());
        System.out.println(dir1.calculaSalario());
    }
}