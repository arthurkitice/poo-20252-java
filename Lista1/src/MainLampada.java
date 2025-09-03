import exe1.Lampada;

import java.util.Scanner;

public class MainLampada {
    public static void main(String[] args) {
        /* Exercício 1 - Lâmpada */

        //Classe Lampada
        Lampada lamp1 = new Lampada();
        lamp1.marca = "eletrolux";
        lamp1.cor = "vermelho";
        lamp1.brilho = 200;
        lamp1.ligada = true;

        //Métodos
        System.out.println("\n- Dados da lâmpada 1 -");
        lamp1.exibe();
        lamp1.desligar();
        lamp1.ligar();
        lamp1.ajustarBrilho(60);
        lamp1.mudarCor("rosa");
        System.out.println("\n- Dados da lâmpada 1 após alterações -");
        lamp1.exibe();

        //Objeto usando o construtor vazio
        Lampada lamp2 = new Lampada();

        //Entrada
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite a marca da lâmpada: ");
        lamp2.marca = entrada.next();
        System.out.println("Digite a cor da lâmpada: ");
        lamp2.cor = entrada.next();
        System.out.println("Digite o brilho da lâmpada (0-100): ");
        lamp2.brilho = entrada.nextInt();
        System.out.println("Digite o estado da lâmpada (ligada-desligada -> true-false): ");
        lamp2.ligada = entrada.nextBoolean();

        lamp2.exibe();
    }
}