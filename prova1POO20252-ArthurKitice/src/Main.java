/*
    Prova 1º Bimestre POO 2025-2
    Aluno: Arthur Kitice Barreto Ferreira da Cunha
*/

import questao1.*;

public class Main {
    public static void main(String[] args) {
        ObraArte obra1 = new ObraArte("Teste", "Desconhecido");
        System.out.println(obra1.descrever());

        Pintura pint1 = new Pintura("Noite Estrelada", "Van Gogh", "óleo sobre tela");
        System.out.println(pint1.descrever());
        System.out.println(pint1.toString());

        Escultura escu1 = new Escultura("Davi", "Michelangelo", "mármore");
        System.out.println(escu1.descrever());
        System.out.println(escu1.toString());

        Instalacao inta1 = new Instalacao("Instalação1", "Artista1", true);
        System.out.println(inta1.descrever());
        System.out.println(inta1.toString());

        Exposicao expo1 = new Exposicao("Exposição Daniel");
        expo1.addObra(obra1);
        expo1.addObra(pint1);
        expo1.addObra(escu1);
        expo1.addObra(inta1);
        expo1.exibirObras();
        expo1.resumo();
        expo1.removeObra("Noite Estrelada");
        expo1.exibirObras();
    }
}