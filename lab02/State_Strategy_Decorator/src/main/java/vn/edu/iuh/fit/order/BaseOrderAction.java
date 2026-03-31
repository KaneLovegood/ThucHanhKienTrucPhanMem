package vn.edu.iuh.fit.order;

public class BaseOrderAction implements OrderAction {
    @Override
    public void execute(OrderData orderData) {
        System.out.printf("  [Action] Xu ly don hang %s cho %s%n",
                orderData.getOrderId(), orderData.getCustomerName());
    }
}
