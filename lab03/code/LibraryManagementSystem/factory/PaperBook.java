package LibraryManagementSystem.factory;


public class PaperBook extends Book{

    public PaperBook(String t,String a,String c){
        super(t,a,c);
    }

    public String getInfo(){
        return "PaperBook: " + title;
    }
}