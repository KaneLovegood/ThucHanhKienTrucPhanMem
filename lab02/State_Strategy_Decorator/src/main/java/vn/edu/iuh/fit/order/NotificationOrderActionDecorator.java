package vn.edu.iuh.fit.order;

public class NotificationOrderActionDecorator extends OrderActionDecorator {
    public NotificationOrderActionDecorator(OrderAction wrappee) {
        super(wrappee);
    }

    @Override
    public void execute(OrderData orderData) {
        wrappee.execute(orderData);
        System.out.printf("  [Notify] Gui thong bao cap nhat don %s%n", orderData.getOrderId());
    }
}
