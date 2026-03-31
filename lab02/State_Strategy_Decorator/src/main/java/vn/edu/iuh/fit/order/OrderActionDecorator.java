package vn.edu.iuh.fit.order;

public abstract class OrderActionDecorator implements OrderAction {
    protected final OrderAction wrappee;

    protected OrderActionDecorator(OrderAction wrappee) {
        this.wrappee = wrappee;
    }
}
