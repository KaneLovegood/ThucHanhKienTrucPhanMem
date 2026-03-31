package vn.edu.iuh.fit.tax;

public class RoundingDecorator extends TaxCalculatorDecorator {
    public RoundingDecorator(TaxCalculator wrappee) {
        super(wrappee);
    }

    @Override
    public double calculateTotal(double basePrice, TaxStrategy strategy) {
        double total = wrappee.calculateTotal(basePrice, strategy);
        return Math.round(total);
    }
}
