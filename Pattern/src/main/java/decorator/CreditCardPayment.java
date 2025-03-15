package decorator;

public class CreditCardPayment implements Payment{
    @Override
    public double pay(double amount) {
        System.out.println("Paid " + amount + " by credit card");
        return amount;
    }
}
