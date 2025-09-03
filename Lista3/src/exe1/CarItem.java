package exe1;

public class CarItem {
    private int quantidade;
    private Product produto;

    public CarItem() {
    }

    public CarItem(int quantidade, Product produto) {
        this.quantidade = quantidade;
        this.produto = produto;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public Product getProduto() {
        return produto;
    }

    public void setProduto(Product produto) {
        this.produto = produto;
    }

    @Override
    public String toString() {
        return "\nCarItem{" +
                "quantidade=" + quantidade +
                ", produto=" + produto +
                '}';
    }
}
