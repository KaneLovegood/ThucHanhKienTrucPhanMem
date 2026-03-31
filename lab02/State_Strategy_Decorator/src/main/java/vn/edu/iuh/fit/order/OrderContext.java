package vn.edu.iuh.fit.order;

public class OrderContext {
    private final OrderData orderData;
    private final OrderValidationStrategy validationStrategy;
    private final OrderAction orderAction;
    private OrderState state;

    public OrderContext(OrderData orderData,
                        OrderValidationStrategy validationStrategy,
                        OrderAction orderAction) {
        this.orderData = orderData;
        this.validationStrategy = validationStrategy;
        this.orderAction = orderAction;
        this.state = new NewOrderState();
    }

    public OrderData getOrderData() {
        return orderData;
    }

    public OrderValidationStrategy getValidationStrategy() {
        return validationStrategy;
    }

    public OrderAction getOrderAction() {
        return orderAction;
    }

    public void setState(OrderState state) {
        this.state = state;
    }

    public void process() {
        state.handle(this);
    }

    public String getCurrentState() {
        return state.name();
    }
}
