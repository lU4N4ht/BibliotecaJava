package br.senai.sp.jandira.biblioteca.Model;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Library {
    List <Book> Books = new ArrayList<>();
    public void  addBooks (Book book){
        Books.add(book);
    }

}
