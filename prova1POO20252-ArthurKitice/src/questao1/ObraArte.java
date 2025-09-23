package questao1;

public class ObraArte {
    protected String titulo, artista;

    public ObraArte() {
    }

    public ObraArte(String titulo, String artista) {
        this.titulo = titulo;
        this.artista = artista;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public String descrever(){
        return "Ainda não sei qual obra de arte eu sou";
    }

    @Override
    public String toString() {
        return "ObraArte{" +
                "titulo='" + titulo + '\'' +
                ", artista='" + artista + '\'' +
                '}';
    }
}

