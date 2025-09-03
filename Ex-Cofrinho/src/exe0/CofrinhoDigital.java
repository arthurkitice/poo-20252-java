package exe0;

public class CofrinhoDigital {

    private double saldo; //Privada, pois o usuário não deve atribuir qualquer valor
    private boolean fechado;

    //Construtor vazio
    public CofrinhoDigital(){
        //Valores default
        //Isso não seria necessário tecnicamente, pois o Java atribui valores padrões
        //Qualquer valor númerico é atribuido 0, boolean é false e string é null
        this.saldo = 0;
        this.fechado = false;
    }

    //Construtor com parâmetros
    public CofrinhoDigital(double saldo, boolean fechado){
        this.setSaldo(saldo);
        this.fechado = fechado;
    }

    public void setSaldo(double saldo){
        if(saldo>=0){
            this.saldo = saldo;
        }
        else System.out.println("Saldo inválido (Deve ser maior que zero)");
    }

    public double getSaldo(){
        return this.saldo;
    }

    public boolean getFechado() {
        return this.fechado;
    }

    public void abrir(){
        if(this.fechado){
            this.fechado = false;
            System.out.println("Cofrinho aberto.");
        }
        else System.out.println("Cofrinho já está aberto.");
    }

    public void fechar(){
        if(!this.fechado){
            this.fechado = true;
            System.out.println("Cofrinho fechado.");
        }
        else System.out.println("Cofrinho já está fechado.");
    }

    public void depositar(double valor){
        if(!this.fechado && valor>0){
            this.saldo += valor;
            System.out.println("Depositado mais " + valor + " no seu cofrinho digital.");
        }
        else System.out.println("Depósito não completado (Valor tem maior que zero e o cofrinho deve estar aberto)");
    }

    public void retirarTudo(){
        if(!this.fechado && this.saldo > 0){
            System.out.println("Valor retirado: " + this.saldo);
            this.saldo = 0;
        }
        else System.out.println("Impossível retirar tudo (cofrinho fechado ou já zerado)");
    }

    public void exibir(){
        System.out.println("Saldo disponível: " + this.saldo + "\nConta " + (this.fechado ? "fechada." : "aberta."));
    }
}
