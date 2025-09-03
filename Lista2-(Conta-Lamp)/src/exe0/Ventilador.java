package exe0;

public class Ventilador {
    /*
        Variáveis encapsuladas -> privadas
        O usuário não consegue alterar manualmente,
        nem mesmo acessar os seus valores
    */

    private int velocidade; //Privada, pois o usuário não deve atribuir qualquer valor
    private boolean ligado;

    /*
        Métodos construtores: Construtor vazio sem parâmetros (com variáveis default) e
        contrutor com parâmetros.
     */

    //Construtor vazio
    public Ventilador(){
        //Valores default
        this.velocidade = 0;
        this.ligado = false;
    }

    //Construtor com parâmetros
    public Ventilador(int velocidade, boolean ligado){
        //Necessário usar setters quando há variáveis privadas, pois caso contrário o
        //usuário conseguiria atribuir qualquer valor para elas, de modo a quebrar a
        //a lógica do código. Por isso usa-se os setters para previnir valores errados.
        this.setVelocidade(velocidade);
        this.setLigado(ligado);
    }

    /*
        Setters: Quando uma variável é privada o usuário não consegue alterar seu valor
        de forma direta, por isso é necessário criar métodos para que ele atribua
        valores para as variáveis. Isso é bom pois é possível controlar intervalos e valores
        adequados usando condicionais.
    */

    public void setVelocidade(int velocidade){
        if(velocidade>=0 && velocidade<=3){
            this.velocidade = velocidade;
            if(velocidade == 0){
                this.ligado = false;
            }
        }
        else System.out.println("Velocidade inválida: mínima 0, máxima 3");
    }

    public void setLigado(boolean ligado){
        this.ligado = ligado;
    }

    /*
        Getters: Quando uma variável é privada, o usuário não consegue printar,
        nem mesmo atribuir outras variáveis com o mesmo valor. Por isso é importante
        atribuir métodos para que o usuário consiga extrair o valor dessas variáveis.
     */

    public int getVelocidade(){
        return this.velocidade;
    }

    public boolean getLigado(){
        return this.ligado;
    }

    /*
        Métodos
    */

    public void acelerar(){
        //this.velocidade += 1 -> ERRADO, o usuário pode aumentar a velocidade quanto quiser
        this.setVelocidade(this.getVelocidade() + 1);
        // Usar o setter é necessário para limitar (seria possível um if também, mas para a
        // simplificação da estrutura do código, é interessante usar os setters, pois eles
        // já contém os if's). Usar o getter não é necessário, pois já está dentro da classe.
        // Portanto uma estrutura alternativa seria: this.setVelocidade(this.velocidade + 1);
    }

    public void desacelerar(){
        //this.velocidade -= 1 -> ERRADO, pelos motivos citados previamente
        this.setVelocidade(this.velocidade - 1); //Utilizando a estutura sem o getter.
    }

    //Metodo encapsulado (Só pode ser usado dentro da classe)
    private boolean ehPar(){
        return this.velocidade % 2 == 0;
    }
}
