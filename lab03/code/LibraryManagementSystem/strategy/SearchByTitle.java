package LibraryManagementSystem.strategy;



import java.util.List;

import LibraryManagementSystem.factory.Book;

public class SearchByTitle implements SearchStrategy{

    public void search(List<Book> books,String keyword){

        for(Book b : books){
            if(b.getTitle().equalsIgnoreCase(keyword)){
                System.out.println("Found: " + b.getInfo());
            }
        }
    }
}