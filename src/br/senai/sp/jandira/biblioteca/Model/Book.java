package br.senai.sp.jandira.biblioteca.Model;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
public class Book {
    public List<Book> books = new ArrayList<>();
    Scanner teclado = new Scanner(System.in);
    public String bookTitle ,
            bookAuthor,
            bookGenre,
            description;
    public int isbn;

    public void addBook() {
        do {
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
        } while (teclado.nextLine().equalsIgnoreCase("Y"));
    }
}
