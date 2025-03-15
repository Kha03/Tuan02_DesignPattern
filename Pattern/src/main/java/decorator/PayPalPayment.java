package decorator;

public class PayPalPayment implements Payment{
    @Override
    public double pay(double amount) {
        System.out.println("Paid " + amount + " by PayPal");
        return amount;
    }
}
