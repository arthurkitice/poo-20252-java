import ex2.CartaoCredito;
import ex2.Pagamento;
import ex2.Pix;

import java.util.ArrayList;
import java.util.List;

public class MainPagamento {
    public static void main(String[] args){
        CartaoCredito ct1 = new CartaoCredito();
        Pix px1 = new Pix();
        CartaoCredito ct2 = new CartaoCredito();
        Pix px2 = new= new
                CartaoCredito ct3 = new CartaoCredito();
        Pix px3 = new Pix();

        List<Pagamento> lista = new ArrayList<>();
        lista.add(ct1);
        lista.add(px1);
        lista.add(ct2);
        lista.add(px2);
        lista.add(ct3);
        lista.add(px3);

        for(Pagamento pag : lista) {
            pag.autorizar(Math.round(Math.random()*100000)/100.0);
        }
    }
}
