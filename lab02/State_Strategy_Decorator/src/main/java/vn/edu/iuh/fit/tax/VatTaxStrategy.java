package vn.edu.iuh.fit.tax;

public class VatTaxStrategy implements TaxStrategy {
    @Override
    public double calculateTax(double basePrice) {
        return basePrice * 0.10;
    }

    @Override
    public String name() {
        return "VAT 10%";
    }
}
