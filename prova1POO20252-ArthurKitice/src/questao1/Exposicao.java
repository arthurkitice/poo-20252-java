package questao1;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Exposicao {
    private String nome;
    private List<ObraArte> obras;

    public Exposicao() {
        this.obras = new ArrayList<ObraArte>();
    }

    public Exposicao(String nome) {
        this.nome = nome;
        this.obras = new ArrayList<ObraArte>();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<ObraArte> getObras() {
        return obras;
    }

    public void addObra(ObraArte obra){
        this.obras.add(obra);
        System.out.println("Obra adicionada com sucesso.");
    }

    public void removeObra(String titulo){
        for(ObraArte item: obras){
            if(Objects.equals(item.getTitulo(), titulo)){
                System.out.println(item.getTitulo());
                obras.remove(item);
                System.out.println("Obra removida com sucesso.");
                return;
            }
        }
        System.out.println("Obra não está presente na exposição.");
    }

    public void exibirObras(){
        for(ObraArte obra: obras){
            System.out.println(obra.getTitulo());
        }
    }

    public void resumo(){
        System.out.println("Obra em exposição: " + this.nome + "\nTotal de obras: " + obras.size());
    }
}

