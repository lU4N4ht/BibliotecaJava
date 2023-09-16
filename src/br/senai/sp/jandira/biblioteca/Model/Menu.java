package br.senai.sp.jandira.biblioteca.Model;

import java.util.Scanner;
public class Menu {
    Scanner teclado = new Scanner(System.in);

    Register userregister = new Register();

    Login userlogin = new Login();

    boolean validRegister = true;
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

            switch (menuChoice){
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

        boolean userMenuType = true;

        if(userMenuType == true){

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

        }
        userMenuType = false;

        if (userMenuType == false){
            System.out.println("+______________________________________________________+");
            System.out.println("| Chose one option.....................................| ");
            System.out.println("| 1 - Register a book..................................|");
            System.out.println("| 2 - Exit.............................................|");
            System.out.println("+______________________________________________________+");
            int libraryChoice = teclado.nextInt();

            switch (libraryChoice) {
                case 1:
                    while (validRegister) {
                        System.out.println("Do you want to register another book? [Y - N]");
                        String answer = teclado.nextLine();

                        if (answer.equalsIgnoreCase("S")) {
                            Book book = new Book();
                            book.bookRegister();
                        } else if (answer.equalsIgnoreCase("N")) {
                            validRegister = false;
                        } else {
                            System.out.println("Tecla Invalida");
                        }
                    }
                    break;
                case 2:
                    exit = true;
                    break;
            }

        }
    }
}
