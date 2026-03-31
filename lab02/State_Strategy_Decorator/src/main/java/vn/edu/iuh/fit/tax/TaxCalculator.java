package vn.edu.iuh.fit.tax;

public interface TaxCalculator {
    double calculateTotal(double basePrice, TaxStrategy strategy);
}
