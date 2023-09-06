package br.senai.sp.jandira.biblioteca.Model;

import java.util.Scanner;
public class Menu {
    public void Menu() {
        Scanner teclado = new Scanner(System.in);

        UserRegister userregister = new UserRegister();

        UserLogin userlogin = new UserLogin();

        boolean exit = false;

        while (!exit) {
            System.out.println("+______________________________________________________+");
            System.out.println("|                  L U L U L I B R A R Y               |");
            System.out.println("+______________________________________________________+");
            System.out.println("|        W E L C O M E  T O  T H E  L I B R A R Y !    |");
            System.out.println("+______________________________________________________+");
            System.out.println("| Chose one option.....................................| ");
            System.out.println("| 1 - Register..........................................|");
            System.out.println("| 2 - Login............................................|");
            System.out.println("| 3 - Exit.............................................|");
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
                    exit = true;
                    break;
            }


        }
    }
}
