package br.senai.sp.jandira.biblioteca.Model;

import java.util.Scanner;

public class UserLogin {
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

        if (password != client.password || email != client.email){
            System.err.println("Your password or your email is WRONG!");
        }
        System.out.println("+---------------------------------------------------------+");
        return client;
    }
    public Librarian LibrarianLogin() {
        System.out.println("+-------------------- LIBRARIAN'S LOGIN --------------------+");
        System.out.print("| What's your email: ");
        email = teclado.nextLine();
        System.out.print("| Insert your password: ");
        password = teclado.nextLine();

        if (password != librarian.password || email != librarian.email){
            System.err.println("Your password or your email is WRONG!");
        }
        System.out.println("+---------------------------------------------------------+");
        return librarian;
    }
}
