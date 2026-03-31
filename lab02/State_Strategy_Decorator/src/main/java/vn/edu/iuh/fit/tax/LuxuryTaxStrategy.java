package vn.edu.iuh.fit.tax;

public class LuxuryTaxStrategy implements TaxStrategy {
    @Override
    public double calculateTax(double basePrice) {
        return basePrice * 0.25;
    }

    @Override
    public String name() {
        return "Xa xi 25%";
    }
}
