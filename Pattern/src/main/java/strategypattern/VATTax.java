package strategypattern;

public class VATTax implements TaxStrategy {
    @Override
    public double calculateTax(double price) {
        return price * 0.10; // Thuế VAT 10%
    }
}
