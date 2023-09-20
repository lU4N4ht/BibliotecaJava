package br.senai.sp.jandira.biblioteca.Model;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
public class Book {
    public List <Book> books = new ArrayList<>();
    Scanner teclado = new Scanner(System.in);
    public String bookTitle,
            bookAuthor,
            bookGenre,
            description,
            choice;
    public int isbn;

    public void addBook() {

        for (; choice.equalsIgnoreCase("Y"); ) {

            Book book = new Book();

            System.out.println("+-------------------- BOOK REGISTER --------------------+");
            System.out.print("| What's the book's title: ");
            book.bookTitle = teclado.nextLine();
            System.out.print("| What's the book's author: ");
            book.bookAuthor = teclado.nextLine();
            System.out.print("| What's the book's genre: ");
            book.bookGenre = teclado.nextLine();
            System.out.print("| What's the book's description: ");
            book.description = teclado.nextLine();
            System.out.print("| What's the book's ISBN: ");
            book.isbn = teclado.nextInt();

            books.add(book);

            System.out.println("------------------------------------------------------");
            System.out.println("Do you want to register another book? (Y/N): ");
            choice = teclado.nextLine();
            if (choice.equalsIgnoreCase("N")) {
                break;

            }
        }
    }

    public void listBook() {
        for (Book book : books) {
            System.out.println(book.bookAuthor);
            System.out.println(book.bookGenre);
            System.out.println(book.bookTitle);
            System.out.println(book.isbn);
            System.out.println(" ");
        }
    }
}
