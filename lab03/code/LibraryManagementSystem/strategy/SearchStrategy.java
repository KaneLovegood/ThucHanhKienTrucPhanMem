package LibraryManagementSystem.strategy;


import java.util.List;

import LibraryManagementSystem.factory.Book;


public interface SearchStrategy {

    void search(List<Book> books,String keyword);

}