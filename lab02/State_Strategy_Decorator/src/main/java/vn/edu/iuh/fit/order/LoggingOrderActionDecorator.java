package vn.edu.iuh.fit.order;

public class LoggingOrderActionDecorator extends OrderActionDecorator {
    public LoggingOrderActionDecorator(OrderAction wrappee) {
        super(wrappee);
    }

    @Override
    public void execute(OrderData orderData) {
        System.out.printf("  [Log] Bat dau thao tac voi don %s%n", orderData.getOrderId());
        wrappee.execute(orderData);
    }
}
