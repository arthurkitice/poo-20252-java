import exe.Book;
import exe.LibraryUser;

public class Main{
    public static void main(String[] args) {
        Book livro1 = new Book("Admirável Mundo Novo", "Aldous Huxley", 1932);
        Book livro2 = new Book("O Guia do Mochileiro das Galáxias", "Douglas Adams", 1979);
        Book livro3 = new Book("1984", "George Orwell", 1949);
        Book livro4 = new Book("A Revolução dos Bichos", "George Orwell", 1945);
        Book livro5 = new Book("O Senhor das Moscas", "William Golding", 1954);
        Book livro6 = new Book("O Príncipe", "Nicolau Maquiavel", 1532);

        LibraryUser user1 = new LibraryUser("Fábio");
        user1.addLoan(livro1, 30);
        user1.addLoan(livro2, 15);
        user1.addLoan(livro3, 20);
        user1.addLoan(livro4, 5);
        user1.addLoan(livro5, 10);
        user1.addLoan(livro6, 30);

        System.out.println(user1.toString());
        user1.listBooks();

        user1.removeLoan(livro3);

        System.out.println(user1.toString());

        System.out.println("Total de dias emprestados: "+ user1.totalDaysBorrowed());

        user1.clearLoans();
        System.out.println((user1.isEmpty() ? "A lista está vazia" : "A lista não está vazia"));
    }
}