package br.senai.sp.jandira.biblioteca.Model;

import java.util.Scanner;
public class Login {
    Client client = new Client();
    Librarian librarian = new Librarian();
    public String email, password;
    public String choice;
    Scanner teclado = new Scanner(System.in);
    public void choicesLogin() {
        System.out.println("| Choose who you want to login (Client | Librarian)|");
        choice = teclado.nextLine();
        System.out.println(" ");

        switch (choice.toLowerCase()) {
            case "client":
                ClientLogin();
                break;
            case "librarian":
                LibrarianLogin();
                break;
        }
    }
    public Client ClientLogin() {
        System.out.println("+-------------------- CLIENT'S LOGIN --------------------+");
        System.out.print("| What's your email: ");
        email = teclado.nextLine();
        System.out.print("| Insert your password: ");
        password = teclado.nextLine();

        if (password.equals(client.password) && email.equals(client.email)){
            System.out.println("| Login successful!");
        } else{
            System.err.println("Your password or your email is WRONG!");
        }
        System.out.println("+---------------------------------------------------------+");
        return client;
    }
    public Librarian LibrarianLogin() {
        System.out.println("+-------------------- LIBRARIAN'S LOGIN --------------------+");
        System.out.print("| What's your email: ");
        librarian.email = teclado.nextLine();
        System.out.print("| Insert your password: ");
        librarian.password = teclado.nextLine();

        if (password.equals(librarian.password) && email.equals(librarian.email)){
            System.out.println("| Login successful!");

        } else {
            System.err.println("Your password or your email is WRONG!");
        }
        System.out.println("+---------------------------------------------------------+");
        return librarian;
    }
}
