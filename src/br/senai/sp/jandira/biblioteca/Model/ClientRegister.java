package br.senai.sp.jandira.biblioteca.Model;

import java.util.Scanner;
public class ClientRegister {
    Scanner teclado = new Scanner(System.in);
    Client client = new Client();
    Librarian librarian = new Librarian();

    public Client ClientRegister() {
        System.out.println("+-------------------- CLIENT'S REGISTER --------------------+");
        System.out.print("| What's your name: ");
        client.name = teclado.nextLine();
        System.out.print("| What's your age: ");
        client.age = teclado.nextInt();
        teclado.nextLine();

        if(client.age < 18){
            System.out.println("+---------------------------------------------------+");
            System.out.println("You have to be of legal age to complete the register");
            System.out.println("+---------------------------------------------------+");

        } else {

            System.out.print("| What's your email: ");
            client.email = teclado.nextLine();

            System.out.print("| What's your phone number: ");
            client.phoneNumber = teclado.nextInt();

            System.out.print("| What's your address: ");
            client.address = teclado.nextLine();
        }
        System.out.println("+---------------------------------------------------------------+");
        return client;
    }
    public Librarian LibrarianRegister() {
        System.out.println("+-------------------- LIBRARIAN'S REGISTER --------------------+");
        System.out.print("| What's your name: ");
        librarian.name = teclado.nextLine();
        System.out.print("| What's your email: ");
        librarian.email = teclado.nextLine();
        System.out.print("| What's your password: ");
        librarian.password = teclado.nextLine();
        System.out.println("+---------------------------------------------------------------+");

        return librarian;
    }
}


