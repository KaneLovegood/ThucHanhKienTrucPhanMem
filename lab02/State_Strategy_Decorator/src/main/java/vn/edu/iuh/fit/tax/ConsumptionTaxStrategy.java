package vn.edu.iuh.fit.tax;

public class ConsumptionTaxStrategy implements TaxStrategy {
    @Override
    public double calculateTax(double basePrice) {
        return basePrice * 0.15;
    }

    @Override
    public String name() {
        return "Tieu thu 15%";
    }
}
