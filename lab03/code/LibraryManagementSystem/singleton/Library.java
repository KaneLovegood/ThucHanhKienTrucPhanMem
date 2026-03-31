package LibraryManagementSystem.singleton;


import java.util.ArrayList;
import java.util.List;

import LibraryManagementSystem.factory.Book;

public class Library {

    private static Library instance;
    private List<Book> books = new ArrayList<>();

    private Library(){}

    public static Library getInstance(){
        if(instance == null){
            instance = new Library();
        }
        return instance;
    }

    public void addBook(Book book){
        books.add(book);
        System.out.println("Added book: " + book.getInfo());
    }

    public List<Book> getBooks(){
        return books;
    }
}