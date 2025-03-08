package statepattern;

public class ProcessingState implements OrderState{
    @Override
    public void state(OrderContext context) {
        System.out.println("Processing");
        context.setOrderState(new ShippedState());
    }
}
