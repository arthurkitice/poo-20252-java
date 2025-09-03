import exe1.Product;
import exe1.ShoppingCart;

public class MainEcommerce {
    public static void main(String[] args) {
        // criação dos produtos
        Product objProd1 = new Product("A", 100);
        Product objProd2 = new Product("B", 50);
        Product objProd3 = new Product("C", 500);

        ShoppingCart objSC = new ShoppingCart(1);
        // adiciona os itens do carrinho
        objSC.addCarItem(3, objProd1);
        objSC.addCarItem(5, objProd2);
        objSC.addCarItem(1, objProd3);

        System.out.println(objSC.toString());

        objSC.valorTotal();

        objSC.removeCarItem("C");

        System.out.println(objSC.toString());
    }
}
