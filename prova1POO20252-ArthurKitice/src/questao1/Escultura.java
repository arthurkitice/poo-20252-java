package questao1;

public class Escultura extends ObraArte {
    private String material = "não definido";

    public Escultura() {
        super();
    }

    public Escultura(String titulo, String artista, String material) {
        super(titulo, artista);
        this.material = material;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    @Override
    public String descrever(){
        return "Escultura esculpida em: " + this.material;
    }

    @Override
    public String toString() {
        return "Escultura{" +
                "material=" + this.material + '\'' + super.toString() +
                '}';
    }
}

