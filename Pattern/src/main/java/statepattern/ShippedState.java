package statepattern;

public class ShippedState implements OrderState{
    @Override
    public void state(OrderContext context) {
        System.out.println("Order delivered successfully.");
    }
}
