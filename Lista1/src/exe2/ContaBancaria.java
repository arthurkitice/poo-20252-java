package exe2;

public class ContaBancaria {
    public String titular; //Seria possível fazer: public String titular, numero;
    public String numero;
    public double saldo;
    public boolean ativa;

    //Métodos construtores
    public ContaBancaria(){}

    public ContaBancaria(String titular, String numero, double saldo, boolean ativa){
        this.titular = titular;
        this.numero = numero;
        this.saldo = saldo;
        this.ativa = ativa;
    }

    //Métodos
    public void exibe(){
        System.out.println("\nTitular: " + this.titular +
                "\nNúmero: " + this.numero.replaceFirst(".{1,4}", "****") +
                //Poderia ser feito usando substring(4, numero.length()-1) -> (Se omitir o .length()-1 dá certo)
                //O problema é que isso não funciona como o regex para numeros menores que 4, ele vai apenas começar a partir do index 4
                "\nSaldo: " + this.saldo +
                "\nAtiva: " + this.ativa);
    }

    public void ativar(){
        if(!this.ativa){
            this.ativa = true;
            System.out.println("Conta ativada.");
        }
        else System.out.println("Operação falhou (Conta já ativada).");
    }

    public void desativar(){
        if(this.ativa && this.saldo >= 0){
            this.ativa = false;
            System.out.println("Conta desativada.");
        }
        else System.out.println("Operação falhou (Conta já desativada ou negativada).");
    }

    public void depositar(double valor){
        if(valor > 0 & this.ativa){
            this.saldo += valor;
            System.out.println("Depósito realizado com sucesso.");
        }
        else System.out.println("Depósito falhou (Valor inválido ou conta inativa).");
    }

    public void sacar(double valor){
        if(valor > 0 & valor <= this.saldo & this.ativa){
            this.saldo -= valor;
            System.out.println("Saque realizado com sucesso.");
        }
        else System.out.println("Saque falhou (Valor inválido ou conta inativa).");
    }

    public void transferir(ContaBancaria destino, double valor){
        if(valor <= this.saldo && destino.ativa && this.ativa){ //Corre o risco de fazer uma operação em uma conta mas não em outra
            this.sacar(valor);
            destino.depositar(valor);
            System.out.println("Transferência realizada com sucesso.");
        }
        else System.out.println("Transferência falhou (Valor inválido ou pelo menos uma das contas inativas).");
    }
}