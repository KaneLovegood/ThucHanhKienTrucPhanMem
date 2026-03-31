package LibraryManagementSystem.decorate;


public class SpecialEditionBorrow extends BorrowDecorator{

    public SpecialEditionBorrow(Borrow borrow){
        super(borrow);
    }

    public String borrow(){
        return borrow.borrow() + " + special edition";
    }
}