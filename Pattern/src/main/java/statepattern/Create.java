package statepattern;

public class Create implements OrderState{
    @Override
    public void state(OrderContext context) {
        System.out.println("Create");
        context.setOrderState(new ProcessingState());
    }
}
