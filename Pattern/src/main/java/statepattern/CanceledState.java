package statepattern;

public class CanceledState implements OrderState{
    @Override
    public void state(OrderContext context) {
        System.out.println("Order canceled.");
    }
}
