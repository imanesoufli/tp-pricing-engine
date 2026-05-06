package org.example;

public class TaxService {

    public double apply(double amount) {
        return amount * 1.19; // Using 19% tax as seen in PriceCalculator
    }
}
