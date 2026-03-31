package vn.edu.iuh.fit.tax;

public interface TaxStrategy {
    double calculateTax(double basePrice);
    String name();
}
