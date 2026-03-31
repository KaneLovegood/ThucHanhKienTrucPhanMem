package vn.edu.iuh.fit.tax;

public class LuxuryProductState implements TaxState {
    @Override
    public double apply(ProductTaxContext context) {
        System.out.println("- State: San pham xa xi");
        return context.getTaxCalculator().calculateTotal(context.getBasePrice(), context.getTaxStrategy());
    }

    @Override
    public String name() {
        return "XA_XI";
    }
}
