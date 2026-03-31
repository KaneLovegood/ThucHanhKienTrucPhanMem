package LibraryManagementSystem.strategy;


import java.util.List;

import LibraryManagementSystem.factory.Book;

public class LibrarySearch {

    private SearchStrategy strategy;

    public void setStrategy(SearchStrategy strategy){
        this.strategy = strategy;
    }

    public void execute(List<Book> books,String keyword){
        strategy.search(books,keyword);
    }
}