package vn.edu.iuh.fit.tax;

public class BaseTaxCalculator implements TaxCalculator {
    @Override
    public double calculateTotal(double basePrice, TaxStrategy strategy) {
        return basePrice + strategy.calculateTax(basePrice);
    }
}
