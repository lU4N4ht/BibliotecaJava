package br.senai.sp.jandira.biblioteca.Model;
import java.util.Scanner;
public class Book {
    Scanner teclado = new Scanner(System.in);
    public String bookTitle ,
            bookAuthor,
            bookGenre,
            description;
    public int isbn;

    public void bookRegister(){
        System.out.println("+-------------------- REGISTER --------------------+");
        System.out.print("| What's the book's title: ");
        bookTitle = teclado.nextLine();
        System.out.print("| What's the book's author: ");
        bookAuthor = teclado.nextLine();
        System.out.print("| What's the book's genre: ");
        bookGenre = teclado.nextLine();
        System.out.print("| What's the book's description: ");
        description = teclado.nextLine();
        System.out.print("| What's the book's ISBN: ");
        isbn = teclado.nextInt();
        System.out.println("+---------------------------------------------------------------+");
    }
    public void setName(String bookTitle){
        this.bookTitle = bookTitle;
    }
    public String getName(){
        return bookTitle;
    }
}
