package LibraryManagementSystem.factory;

public class AudioBook extends Book{

    public AudioBook(String t,String a,String c){
        super(t,a,c);
    }

    public String getInfo(){
        return "AudioBook: " + title;
    }
}
