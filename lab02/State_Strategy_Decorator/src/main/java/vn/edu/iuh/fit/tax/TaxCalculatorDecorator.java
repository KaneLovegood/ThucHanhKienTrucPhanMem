package vn.edu.iuh.fit.tax;

public abstract class TaxCalculatorDecorator implements TaxCalculator {
    protected final TaxCalculator wrappee;

    protected TaxCalculatorDecorator(TaxCalculator wrappee) {
        this.wrappee = wrappee;
    }
}
