package strategypattern;

public class Product {
    private String name;
    private double price;
    private TaxStrategy taxStrategy;

    public Product(String name, double price, TaxStrategy taxStrategy) {
        this.name = name;
        this.price = price;
        this.taxStrategy = taxStrategy;
    }

    public void setTaxStrategy(TaxStrategy taxStrategy) {
        this.taxStrategy = taxStrategy;
    }

    public double getFinalPrice() {
        double tax = taxStrategy.calculateTax(price);
        return price + tax;
    }

    public void printPriceInfo() {
        System.out.println(name + " | Base Price: $" + price +
                " | Tax: $" + taxStrategy.calculateTax(price) +
                " | Final Price: $" + getFinalPrice());
    }
}
