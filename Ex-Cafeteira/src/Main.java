import exe2.Cafeteira;

public class Main {
    public static void main(String[] args) {
        //Teste de construtor vazio
        Cafeteira obj1 = new Cafeteira();

        //Testes de Métodos, setters e getters do obj1
        obj1.ligar();
        obj1.setAgua(110);
        obj1.setPoCafe(9);
        obj1.exibe();
        System.out.println(obj1.quantosCafesPossiveis());
        System.out.println("Água obj1: " + obj1.getAgua());
        System.out.println("Pó de Café obj1: " + obj1.getPoCafe());
        System.out.println("Obj1 ligado: " + obj1.isLigada());

        //Testes de construtor com parâmetros
        Cafeteira obj2 = new Cafeteira(300, 100, true);

        //Testes de métodos
        System.out.println(obj2.quantosCafesPossiveis());
        obj2.prepararCafe();
        System.out.println(obj2.quantosCafesPossiveis());
        obj2.adicionarAgua(200);
        obj2.adicionarCafe(10);
        obj2.desligar();
        obj2.exibe();
    }
}