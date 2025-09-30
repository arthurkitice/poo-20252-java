import ex1.Funcionario;
import ex1.FuncionarioCLT;
import ex1.FuncionarioPJ;

import java.util.ArrayList;
import java.util.List;

public class MainFuncionario {
    public static void main(String[] args) {
        FuncionarioCLT clt1 = new FuncionarioCLT("Antônio", 2400);
        FuncionarioPJ pj1 = new FuncionarioPJ("Anderson", 3000);
        FuncionarioCLT clt2 = new FuncionarioCLT("Bruno", 1800);
        FuncionarioPJ pj2 = new FuncionarioPJ("Fabio", 5000);
        FuncionarioCLT clt3 = new FuncionarioCLT("Pedro", 3000);
        FuncionarioPJ pj3 = new FuncionarioPJ("Maycon", 2500);

        List<Funcionario> lista = new ArrayList<>();
        lista.add(clt1);
        lista.add(pj1);
        lista.add(clt2);
        lista.add(pj2);
        lista.add(clt3);
        lista.add(pj3);

        for(Funcionario func : lista) {
            func.exibirInfo();
        }
    }
}