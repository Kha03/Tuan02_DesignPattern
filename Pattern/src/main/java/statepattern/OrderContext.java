package statepattern;

public class OrderContext {
    private OrderState orderState;

    public OrderContext() {
        this.orderState = new Create();
    }

    public OrderState getOrderState() {
        return orderState;
    }

    public void setOrderState(OrderState orderState) {
        this.orderState = orderState;
    }
    public void processOrder(){
        orderState.state(this);
    }

}
