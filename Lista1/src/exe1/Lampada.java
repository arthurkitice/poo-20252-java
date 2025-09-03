package exe1;

public class Lampada {
    public String marca;
    public String cor;
    public boolean ligada;
    public int brilho; //de 0 a 100

    public Lampada(){}

    public Lampada(String ma, String cl, boolean on, int br){
        this.marca = ma;
        this.cor = cl;
        this.ligada = on;
        this.brilho = br;
    }

    public void exibe(){
        System.out.println("\nMarca: " + this.marca + "\nCor: " + this.cor + "\nLigada: " + this.ligada + "\nBrilho: " + this.brilho);
    }

    public void ligar(){
        if(!this.ligada) this.ligada = true;
    }

    public void desligar(){
        if(this.ligada){
            this.ligada = false;
            this.brilho = 0;
        }
    }

    public void ajustarBrilho(int x){
        if(this.ligada){
            if(x > 100) this.brilho = 100;
            else this.brilho = x;
        }
    }

    public void mudarCor(String novaCor){
        if(this.ligada){
            this.cor = novaCor;
        }
    }
}
