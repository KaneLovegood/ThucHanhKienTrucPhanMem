package LibraryManagementSystem.factory;


public class EBook extends Book{

    public EBook(String t,String a,String c){
        super(t,a,c);
    }

    public String getInfo(){
        return "EBook: " + title;
    }
}