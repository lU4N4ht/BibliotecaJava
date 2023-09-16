package br.senai.sp.jandira.biblioteca.Model;

import java.util.Scanner;

public class Login {
    Scanner teclado = new Scanner(System.in);
    Client client = new Client();
    Librarian librarian = new Librarian();
    String password;
    String email;
    public String choice;
    public void choicesLogin() {
        System.out.println("| Choose who you want to login (Client | Librarian)|");
        choice = teclado.nextLine();
        System.out.println(" ");

        switch (choice.toLowerCase()) {
            case "client":
                ClientLogin(client);
                break;
            case "librarian":
                LibrarianLogin(librarian);
                break;
        }
    }
    public Client ClientLogin(Client client) {
        System.out.println("+-------------------- CLIENT'S LOGIN --------------------+");
        System.out.print("| What's your email: ");
        email = teclado.nextLine();
        System.out.print("| Insert your password: ");
        password = teclado.nextLine();

        if (password.equals(client.password) && email.equals(client.email)){
            System.out.println("Login successful!");
        } else{
            System.err.println("Your password or your email is WRONG!");
        }
        System.out.println("+---------------------------------------------------------+");
        return client;
    }
    public Librarian LibrarianLogin(Librarian librarian) {
        System.out.println("+-------------------- LIBRARIAN'S LOGIN --------------------+");
        System.out.print("| What's your email: ");
        email = teclado.nextLine();
        System.out.print("| Insert your password: ");
        password = teclado.nextLine();

        if (password.equals(librarian.password) && email.equals(librarian.email)){
            System.err.println("Your password or your email is WRONG!");

        } else {
            System.out.println("Login successful!");
        }
        System.out.println("+---------------------------------------------------------+");
        return librarian;
    }
}
