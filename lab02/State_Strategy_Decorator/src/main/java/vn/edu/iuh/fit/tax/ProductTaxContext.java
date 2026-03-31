package vn.edu.iuh.fit.tax;

public class ProductTaxContext {
    private final String productName;
    private final double basePrice;
    private final TaxStrategy taxStrategy;
    private final TaxCalculator taxCalculator;
    private TaxState state;

    public ProductTaxContext(String productName,
                             double basePrice,
                             TaxStrategy taxStrategy,
                             TaxCalculator taxCalculator,
                             TaxState state) {
        this.productName = productName;
        this.basePrice = basePrice;
        this.taxStrategy = taxStrategy;
        this.taxCalculator = taxCalculator;
        this.state = state;
    }

    public String getProductName() {
        return productName;
    }

    public double getBasePrice() {
        return basePrice;
    }

    public TaxStrategy getTaxStrategy() {
        return taxStrategy;
    }

    public TaxCalculator getTaxCalculator() {
        return taxCalculator;
    }

    public void setState(TaxState state) {
        this.state = state;
    }

    public double calculate() {
        return state.apply(this);
    }
}
