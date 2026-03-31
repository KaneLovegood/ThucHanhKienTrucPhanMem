package vn.edu.iuh.fit.tax;

public interface TaxState {
    double apply(ProductTaxContext context);
    String name();
}
