package decorator;

public class DiscountDecorator extends PaymentDecorator {
    private double discount;
    public DiscountDecorator(Payment payment, double discount) {
        super(payment);
        this.discount = discount;
    }
    @Override
    public double pay(double amount) {
        double totalAmount = amount - amount * discount;
        System.out.println("Discount: " + amount * discount);
        return super.pay(totalAmount);
    }
}
