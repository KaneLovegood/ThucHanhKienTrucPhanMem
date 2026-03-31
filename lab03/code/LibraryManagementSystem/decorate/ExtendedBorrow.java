package LibraryManagementSystem.decorate;

public class ExtendedBorrow extends BorrowDecorator{

    public ExtendedBorrow(Borrow borrow){
        super(borrow);
    }

    public String borrow(){
        return borrow.borrow() + " + extended time";
    }
}