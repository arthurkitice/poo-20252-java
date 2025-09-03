package exe1;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
    private int id;
    // associação com vetor
    private List<CarItem> itens;

    public ShoppingCart() {
        // aloca espaço na memória para o vetor
        this.itens = new ArrayList<CarItem>();
    }

    public ShoppingCart(int id) {
        this.id = id;
        this.itens = new ArrayList<CarItem>();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List<CarItem> getItens() {
        return itens;
    }

    /*
        public void setItens(List<CarItem> itens) {
            this.itens = itens;
        }
    */

    public void addCarItem(int quantidade, Product produto){
        // adiciona item no ArrayList
        this.itens.add(new CarItem(quantidade, produto));
        System.out.println("Item adicionado ao carrinho.");
    }

    @Override
    public String toString() {
        return "ShoppingCart{" +
                "id=" + id +
                ", itens=" + itens +
                '}';
    }

    // criar um metodo que calcula o valor total do carrinho de compras
    public void valorTotal(){
        double total = 0;
        /*
            modo arcaico:
            for(int i = 0; i<itens.size(); i++){
                total += itens.get(i).getQuantidade() * itens.get(i).getProduto().getPreco();
            }
            System.out.println("Total do carrinho: " + total);
         */

        //modo com o "for" melhorado
        for(CarItem item: itens){
            total += item.getQuantidade() * item.getProduto().getPreco();
        }
    }

    public void removeCarItem(String nome){
        for(CarItem item: itens){
             if(item.getProduto().getNome().equals(nome)){
                itens.remove(item);
                 System.out.println("Item removido do carrinho");
                return;
             }
        }
        System.out.println("Item não está presente no carrinho");
    }
}
