package decorator;

public class ProcessingFeeDecorator extends PaymentDecorator{
    double processingFee ;
    public ProcessingFeeDecorator(Payment payment, double processingFee) {
        super(payment);
        this.processingFee = processingFee;
    }

    @Override
    public double pay(double amount) {
        double totalAmount = amount + amount * processingFee;
        System.out.println("Processing fee: " + amount * processingFee);
        return super.pay(totalAmount);
    }
}
