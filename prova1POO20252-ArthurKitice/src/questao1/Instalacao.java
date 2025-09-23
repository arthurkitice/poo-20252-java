package questao1;

public class Instalacao extends ObraArte {
    private Boolean interativa;

    public Instalacao() {
        super();
    }

    public Instalacao(String titulo, String artista, Boolean interativa) {
        super(titulo, artista);
        this.interativa = interativa;
    }

    public Boolean getInterativa() {
        return interativa;
    }

    public void setInterativa(Boolean interativa) {
        this.interativa = interativa;
    }

    @Override
    public String descrever(){
        return this.interativa ? "Instalação interativa" : "Instalação não interativa";
    }

    @Override
    public String toString() {
        return "Instalacao{" +
                "interativa=" + descrever() + '\'' + super.toString() +
                '}';
    }
}

