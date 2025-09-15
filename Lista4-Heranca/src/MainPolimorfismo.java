//Polimorfismo ~> Quando algo consegue assumir formatos diversos
//No contexto de POO, podemos dizer que toda classe pai é polimorfica

import exe0.Assistente;
import exe0.Diretor;
import exe0.Funcionario;
import exe0.Gerente;

import java.util.ArrayList;
import java.util.List;

public class MainPolimorfismo {
    public static void exibe(Funcionario funcionario){
        System.out.println(funcionario.toString());
    }

    public static void main(String[] args){
        //fun1 consegue assumir as propriedades de qualquer filho de funcionário
        Funcionario fun1 = new Funcionario();

        fun1 = new Assistente(
                "Caio",
                "Franca",
                "643.212.452-00",
                1800,
                2
        );

        exibe(fun1);
        System.out.println(fun1.calculaSalario());

        Assistente ass1 = new Assistente(
                "Pedro",
                "Franca",
                "123.456.789-00",
                2000,
                3);

        exibe(ass1);

        Gerente ger1 = new Gerente();

        ger1.setNome("Shamil");
        ger1.setEndereco("Ponta-Fina");
        ger1.setCpf("321.765.234-66");
        ger1.setSalario(5000);
        ger1.setBonus(1000);

        exibe(ger1);

        Diretor dir1 = new Diretor(
                "Guilherme",
                "Xique-Xique",
                "934.213.654-34",
                20000,
                500
        );

        exibe(dir1);

        //Criando um vetor com os funcionários
        List<Funcionario> funcionarios = new ArrayList<>();
        funcionarios.add(fun1);
        funcionarios.add(ass1);
        funcionarios.add(ger1);
        funcionarios.add(dir1);
        for(Funcionario funcionario: funcionarios){
            System.out.println(funcionario.calculaSalario());
        }
    }
}
