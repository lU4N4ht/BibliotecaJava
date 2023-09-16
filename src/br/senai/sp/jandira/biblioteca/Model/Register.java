package br.senai.sp.jandira.biblioteca.Model;

import java.util.Scanner;
public class Register {
    Scanner teclado = new Scanner(System.in);
    Client client = new Client();
    Librarian librarian = new Librarian();
    public String choice;

    public void choicesRegister() {
        System.out.println("| Choose who you want to register (Client | Librarian)|");
        choice = teclado.nextLine();
        System.out.println(" ");

        switch (choice.toLowerCase()) {
            case "client":
                ClientRegister();
                break;
            case "librarian":
                LibrarianRegister();
                break;
        }
    }

    public Client ClientRegister() {
        System.out.println("+-------------------- CLIENT'S REGISTER --------------------+");
        System.out.print("| What's your name: ");
        client.name = teclado.nextLine();
        System.out.print("| What's your age: ");
        client.age = teclado.nextInt();
        teclado.nextLine();

        if(client.age < 18){
            System.err.println("You have to be of legal age to complete the register");
        } else {
            System.out.print("| What's your address: ");
            client.address = teclado.nextLine();

            System.out.print("| What's your email: ");
            client.email = teclado.nextLine();

            System.out.print("| Insert your password: ");
            client.password = teclado.nextInt();
        }
        System.out.println("+---------------------------------------------------------------+");
        return client;
    }
    public Librarian LibrarianRegister() {
        System.out.println("+-------------------- LIBRARIAN'S REGISTER --------------------+");
        System.out.print("| What's your name: ");
        librarian.name = teclado.nextLine();
        System.out.print("| What's your email: ");
        librarian.email = teclado.next();
        System.out.print("| Insert your password: ");
        librarian.password = teclado.next();
        System.out.println("+---------------------------------------------------------------+");
        return librarian;
    }
}


