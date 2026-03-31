package LibraryManagementSystem.factory;

public class BookFactory {

    public static Book createBook(String type,String t,String a,String c){

        if(type.equalsIgnoreCase("paper"))
            return new PaperBook(t,a,c);

        if(type.equalsIgnoreCase("ebook"))
            return new EBook(t,a,c);

        if(type.equalsIgnoreCase("audio"))
            return new AudioBook(t,a,c);

        return null;
    }
}