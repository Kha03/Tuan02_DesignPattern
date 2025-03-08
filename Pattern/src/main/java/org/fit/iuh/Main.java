package org.fit.iuh;

import statepattern.CanceledState;
import statepattern.OrderContext;
import strategypattern.ConsumptionTax;
import strategypattern.LuxuryTax;
import strategypattern.Product;
import strategypattern.VATTax;


//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        OrderContext orderContext = new OrderContext();

        orderContext.processOrder();
        orderContext.processOrder();
        orderContext.processOrder();
        orderContext.setOrderState(new CanceledState());
        orderContext.processOrder();

        Product phone = new Product("Smartphone", 1000, new VATTax());
        Product perfume = new Product("Luxury Perfume", 200, new LuxuryTax());
        Product food = new Product("Packaged Food", 50, new ConsumptionTax());

        phone.printPriceInfo();
        perfume.printPriceInfo();
        food.printPriceInfo();

        System.out.println("\nChanging tax for Smartphone...");
        phone.setTaxStrategy(new LuxuryTax());
        phone.printPriceInfo();
    }
}