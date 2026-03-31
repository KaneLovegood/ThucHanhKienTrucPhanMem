package vn.edu.iuh.fit.tax;

public class EnvironmentalFeeDecorator extends TaxCalculatorDecorator {
    public EnvironmentalFeeDecorator(TaxCalculator wrappee) {
        super(wrappee);
    }

    @Override
    public double calculateTotal(double basePrice, TaxStrategy strategy) {
        double total = wrappee.calculateTotal(basePrice, strategy);
        return total + basePrice * 0.02;
    }
}
