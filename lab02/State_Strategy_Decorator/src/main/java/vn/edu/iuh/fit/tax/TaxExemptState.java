package vn.edu.iuh.fit.tax;

public class TaxExemptState implements TaxState {
    @Override
    public double apply(ProductTaxContext context) {
        System.out.println("- State: Mien thue");
        return context.getBasePrice();
    }

    @Override
    public String name() {
        return "MIEN_THUE";
    }
}
