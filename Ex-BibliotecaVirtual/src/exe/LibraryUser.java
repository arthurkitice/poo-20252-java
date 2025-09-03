package exe;

import java.util.ArrayList;
import java.util.List;

public class LibraryUser {
    private String name;
    private List<LoanItem> loans;

    public LibraryUser() {
        this.loans = new ArrayList<LoanItem>();
    }

    public LibraryUser(String name) {
        this.name = name;
        this.loans = new ArrayList<LoanItem>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<LoanItem> getLoans() {
        return loans;
    }

    public void addLoan(Book book, int days){
        if(this.loans.size() < 5) this.loans.add(new LoanItem(book, days));
        else System.out.println("Falha ao adicionar livro: " + book.getTitle() + ". (Usuário possui o limite máximo de empréstimos)");
    }

    public void removeLoan(Book book){
        for(LoanItem item: this.loans){
            if(item.getBook() == book){
                this.loans.remove(item);
                System.out.println("Empréstimo de livro removido.");
                return;
            }
        }
        System.out.println("Empréstimo de livro não encontrado.");
    }

    public void clearLoans(){
        this.loans.clear();
        System.out.println("Lista esvaziada.");
    }

    public boolean isEmpty(){
        // Primeira ideia: this.loans.size() <= 0 ? true : false
        return this.loans.isEmpty(); //Sugestão do IntelliJ
    }

    public int totalDaysBorrowed(){
        int soma = 0;
        for(LoanItem itens: this.loans){
            soma += itens.getDays();
        }
        return soma;
    }

    public void listBooks(){
        System.out.println("Livros emprestados: ");
        for(LoanItem itens: this.loans){
            System.out.println(itens.getBook().getTitle());
        }
    }

    @Override
    public String toString() {
        return "LibraryUser{" +
                "name='" + name + '\'' +
                ", loans=" + loans +
                '}';
    }
}