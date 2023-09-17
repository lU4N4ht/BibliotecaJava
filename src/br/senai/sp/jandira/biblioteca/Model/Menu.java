package br.senai.sp.jandira.biblioteca.Model;

import java.util.Scanner;

public class Menu {
    Scanner teclado = new Scanner(System.in);
    Register userregister = new Register();
    Login userlogin = new Login();
    Book book = new Book();
    boolean exit = false;

    public void menuUser() {
        while (!exit) {
            System.out.println("+______________________________________________________+");
            System.out.println("|                  L U L U L I B R A R Y               |");
            System.out.println("+______________________________________________________+");
            System.out.println("|        W E L C O M E  T O  T H E  L I B R A R Y !    |");
            System.out.println("+______________________________________________________+");
            System.out.println("| Chose one option.....................................| ");
            System.out.println("| 1 - Register.........................................|");
            System.out.println("| 2 - Login............................................|");
            System.out.println("| 3 - Library..........................................|");
            System.out.println("| 4 - Exit.............................................|");
            System.out.println("+______________________________________________________+");
            int menuChoice = teclado.nextInt();

            switch (menuChoice) {
                case 1:
                    userregister.choicesRegister();
                    break;
                case 2:
                    userlogin.choicesLogin();
                    break;
                case 3:
                    choiceLibrary();
                    break;
                case 4:
                    exit = true;
                    break;
            }
        }
    }

    public void choiceLibrary() {

        boolean choice = true;

        if (!choice) {

            while (!exit) {
                System.out.println("+______________________________________________________+");
                System.out.println("| Chose one option.....................................| ");
                System.out.println("| 1 - Find a book......................................|");
                System.out.println("| 2 - Exit.............................................|");
                System.out.println("+______________________________________________________+");
                int libraryChoice = teclado.nextInt();

                switch (libraryChoice) {
                    case 1:

                        break;
                    case 2:
                        exit = true;
                        break;
                }
            }
        } else {
            System.out.println("+______________________________________________________+");
            System.out.println("| Chose one option.....................................| ");
            System.out.println("| 1 - Register a book..................................|");
            System.out.println("| 2 - Exit.............................................|");
            System.out.println("+______________________________________________________+");
            int libraryChoice = teclado.nextInt();

            switch (libraryChoice) {
                case 1:
                    book.addBook();
                    break;
                case 2:
                    exit = true;
                    break;
            }
        }
    }
}