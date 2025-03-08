package strategypattern;

public class ConsumptionTax implements TaxStrategy {
    @Override
    public double calculateTax(double price) {
        return price * 0.05; // Thuế tiêu thụ 5%
    }
}

