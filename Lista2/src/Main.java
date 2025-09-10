import exe0.Ventilador;

public class Main {
    public static void main(String[] args) {
        //Criação do objeto da classe Ventilador
        Ventilador obj1 = new Ventilador();

        /*
            Testes dos métodos
        */

        obj1.setLigado(true);
        obj1.setVelocidade(5); //Teste com a velocidade incorreta
        obj1.setVelocidade(3); //Teste com a velocidade correta
        obj1.acelerar(); //Não irá aumentar, pois a velocidade já é igual a 3 (máxima)
        obj1.desacelerar(); //Irá reduzir para 2
        System.out.println(obj1.getVelocidade()); //Verificação da velocidade
        System.out.println(obj1.getLigado()); //Verificação do estado do ventilador
    }
}