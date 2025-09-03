import exe0.CofrinhoDigital;

public class Main {
    public static void main(String[] args) {

        CofrinhoDigital obj1 = new CofrinhoDigital();

        obj1.setSaldo(1000);
        obj1.fechar();
        obj1.depositar(2000);
        obj1.exibir();

        obj1.retirarTudo();
        obj1.abrir();
        obj1.depositar(2000);
        obj1.retirarTudo();
        obj1.exibir();

        CofrinhoDigital obj2 = new CofrinhoDigital(500, true);

        obj2.abrir();
        obj2.retirarTudo();
    }
}