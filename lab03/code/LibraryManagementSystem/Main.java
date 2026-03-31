package LibraryManagementSystem;

import LibraryManagementSystem.decorate.BasicBorrow;
import LibraryManagementSystem.decorate.Borrow;
import LibraryManagementSystem.decorate.ExtendedBorrow;
import LibraryManagementSystem.decorate.SpecialEditionBorrow;
import LibraryManagementSystem.factory.Book;
import LibraryManagementSystem.factory.BookFactory;
import LibraryManagementSystem.observer.NotificationService;
import LibraryManagementSystem.observer.User;
import LibraryManagementSystem.singleton.Library;
import LibraryManagementSystem.strategy.LibrarySearch;
import LibraryManagementSystem.strategy.SearchByTitle;

public class Main {

    public static void main(String[] args){

        Library library = Library.getInstance();

        Book b1 = BookFactory.createBook("paper","Java","James","Programming");
        Book b2 = BookFactory.createBook("ebook","Python","Guido","Programming");
        Book b3 = BookFactory.createBook("audio","Design Pattern","GoF","Software");

        library.addBook(b1);
        library.addBook(b2);
        library.addBook(b3);

        LibrarySearch search = new LibrarySearch();
        search.setStrategy(new SearchByTitle());
        search.execute(library.getBooks(),"Java");

        NotificationService notify = new NotificationService();
        User u1 = new User("Alice");
        User u2 = new User("Bob");

        notify.attach(u1);
        notify.attach(u2);

        notify.notifyObservers("New book added to library");

        Borrow borrow = new ExtendedBorrow(new BasicBorrow());
        System.out.println(borrow.borrow());

        Borrow special = new SpecialEditionBorrow(new BasicBorrow());
        System.out.println(special.borrow());

    }
}