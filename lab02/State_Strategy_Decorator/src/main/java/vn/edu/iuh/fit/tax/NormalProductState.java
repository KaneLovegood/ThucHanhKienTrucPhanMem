package vn.edu.iuh.fit.tax;

public class NormalProductState implements TaxState {
    @Override
    public double apply(ProductTaxContext context) {
        System.out.println("- State: San pham thong thuong");
        return context.getTaxCalculator().calculateTotal(context.getBasePrice(), context.getTaxStrategy());
    }

    @Override
    public String name() {
        return "THONG_THUONG";
    }
}
