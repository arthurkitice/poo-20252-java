package exe2;

public class Cafeteira {
    private int agua, poCafe;
    private boolean ligada;

    public Cafeteira() {
        this.ligada = false; this.agua = 0; this.poCafe = 0;
    }

    public Cafeteira(int agua, int poCafe, boolean ligada) {
        this.setAgua(agua);
        this.setPoCafe(poCafe);
        this.setLigada(ligada);
    }

    //Setters
    //Restrição: Água deve estar entre 0 e 2000 ml
    public void setAgua(int agua) {
        if(agua >= 0 && agua <= 2000){
            this.agua = agua;
        }
        else System.out.println("Valor de água inválido.");
    }

    //Restrição: Pó de café deve estar entre 0 e 100 g
    public void setPoCafe(int poCafe) {
        if(poCafe >= 0 && poCafe <= 100){
            this.poCafe = poCafe;
        }
        else System.out.println("Valor de pó de café inválido.");
    }

    public void setLigada(boolean ligada) {
        this.ligada = ligada;
    }

    //Getters ~> É possível gerar automaticamente com o IntelliJ
    //Botão direito ~> Generate ~> Getters
    public int getAgua() {
        return this.agua;
    }

    public int getPoCafe() {
        return this.poCafe;
    }

    public boolean isLigada() {
        return this.ligada;
    }

    //Métodos de Instância
    public void ligar(){
        if(!this.ligada){
            this.ligada = true;
        }
        else System.out.println("Já ligada.");
    }

    public void desligar(){
        if(this.ligada){
            this.ligada = false;
        }
        else System.out.println("Já desligada.");
    }

    public void adicionarAgua(int ml){
        if(this.ligada) this.setAgua(this.agua + ml);
        else System.out.println("Cafeteira desligada.");
    }

    public void adicionarCafe(int gramas){
        if(this.ligada) this.setPoCafe(this.poCafe + gramas);
        else System.out.println("Cafeteira desligada.");
    }

    public void prepararCafe(){
        if(this.ligada && this.agua >= 100 && this.poCafe >= 10){
            this.agua -= 100; this.poCafe -= 10;
        }
    }

    public int quantosCafesPossiveis(){
        //Retorna o menor valor, já que é necessário ambos em quantidades diferentes
        return Math.min(this.agua/100, this.poCafe/10);
    }

    public void exibe(){
        System.out.println("Água: " + this.agua + "ml\nPó de café: " + this.poCafe +
                "g\nLigada: " + (this.ligada ? "Sim" : "Não"));
    }
}
