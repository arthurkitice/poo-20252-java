import exe2.ContaBancaria;
import java.util.Scanner;

public class MainCB {
    public static void main(String[] args){
        /* Exercício 2 - Conta Bancária */

        //Conta 1 - Entrada usando o construtor vazio
        ContaBancaria conta1 = new ContaBancaria();
        conta1.titular = "Paula Tejano";
        conta1.numero = "123456789";
        conta1.saldo = 1000;
        conta1.ativa = true;

        //Conta 2 - Entrada usando o construtor com parâmetros
        ContaBancaria conta2 = new ContaBancaria("Giuseppe Camolle", "987654321", 5000, true);

        //Exibindo ambas a conta antes e depois das alterações
        System.out.println("\n- Dados da conta 1 -");
        conta1.exibe();
        conta1.sacar(1000);
        conta1.desativar();
        conta1.ativar();
        conta1.depositar(1000);

        //Entradas de valores com Scanner e métodos - Depositar, sacar e transferir
        Scanner entrada = new Scanner(System.in);

        System.out.println("Olá " + conta2.titular +
                ". Digite quanto gostaria de depositar: ");
        double valor = entrada.nextDouble();
        conta2.depositar(valor);

        System.out.println("Olá " + conta1.titular +
                ". Digite quanto gostaria de sacar: ");
        valor = entrada.nextDouble();
        conta1.sacar(valor);

        System.out.println("Olá " + conta2.titular +
                ". Digite quanto gostaria de tranferir para a conta de: " + conta1.titular + ": ");
        valor = entrada.nextDouble();
        conta2.transferir(conta1, valor);

        //Exibindo ambas as contas após as alterações
        conta1.exibe();
        conta2.exibe();
    }
}
