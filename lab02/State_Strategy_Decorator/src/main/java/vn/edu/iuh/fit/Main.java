package vn.edu.iuh.fit;

import vn.edu.iuh.fit.order.BaseOrderAction;
import vn.edu.iuh.fit.order.BasicValidationStrategy;
import vn.edu.iuh.fit.order.LoggingOrderActionDecorator;
import vn.edu.iuh.fit.order.NotificationOrderActionDecorator;
import vn.edu.iuh.fit.order.OrderAction;
import vn.edu.iuh.fit.order.OrderContext;
import vn.edu.iuh.fit.order.OrderData;
import vn.edu.iuh.fit.order.StrictValidationStrategy;
import vn.edu.iuh.fit.payment.BasePaymentComponent;
import vn.edu.iuh.fit.payment.CreditCardStrategy;
import vn.edu.iuh.fit.payment.DiscountDecorator;
import vn.edu.iuh.fit.payment.PayPalStrategy;
import vn.edu.iuh.fit.payment.PaymentComponent;
import vn.edu.iuh.fit.payment.PaymentContext;
import vn.edu.iuh.fit.payment.ProcessingFeeDecorator;
import vn.edu.iuh.fit.tax.BaseTaxCalculator;
import vn.edu.iuh.fit.tax.ConsumptionTaxStrategy;
import vn.edu.iuh.fit.tax.EnvironmentalFeeDecorator;
import vn.edu.iuh.fit.tax.LuxuryProductState;
import vn.edu.iuh.fit.tax.LuxuryTaxStrategy;
import vn.edu.iuh.fit.tax.NormalProductState;
import vn.edu.iuh.fit.tax.ProductTaxContext;
import vn.edu.iuh.fit.tax.RoundingDecorator;
import vn.edu.iuh.fit.tax.TaxCalculator;
import vn.edu.iuh.fit.tax.TaxExemptState;
import vn.edu.iuh.fit.tax.VatTaxStrategy;

public class Main {
    public static void main(String[] args) {
        demoOrderManagement();
        demoProductTax();
        demoPaymentSystem();
        printConclusion();
    }

    private static void demoOrderManagement() {
        System.out.println("=== 1) He thong quan ly don hang ===");

        OrderAction action = new NotificationOrderActionDecorator(
                new LoggingOrderActionDecorator(new BaseOrderAction())
        );

        OrderContext successOrder = new OrderContext(
                new OrderData("ORD-001", "Nguyen Van A", 350_000),
                new BasicValidationStrategy(),
                action
        );
        successOrder.process();
        System.out.println("  -> Trang thai cuoi: " + successOrder.getCurrentState());

        OrderContext cancelledOrder = new OrderContext(
                new OrderData("ORD-002", "A", 50_000),
                new StrictValidationStrategy(),
                action
        );
        cancelledOrder.process();
        System.out.println("  -> Trang thai cuoi: " + cancelledOrder.getCurrentState());
        System.out.println();
    }

    private static void demoProductTax() {
        System.out.println("=== 2) Tinh toan thue cho san pham ===");

        TaxCalculator calculator = new RoundingDecorator(
                new EnvironmentalFeeDecorator(new BaseTaxCalculator())
        );

        ProductTaxContext normalProduct = new ProductTaxContext(
                "Do gia dung", 1_000_000, new VatTaxStrategy(), calculator, new NormalProductState()
        );
        double normalTotal = normalProduct.calculate();
        System.out.printf("  %s - Tong sau thue: %.0f VND%n", "Do gia dung", normalTotal);

        ProductTaxContext luxuryProduct = new ProductTaxContext(
                "Dong ho cao cap", 8_000_000, new LuxuryTaxStrategy(), calculator, new LuxuryProductState()
        );
        double luxuryTotal = luxuryProduct.calculate();
        System.out.printf("  %s - Tong sau thue: %.0f VND%n", "Dong ho cao cap", luxuryTotal);

        ProductTaxContext exemptProduct = new ProductTaxContext(
                "Sach giao khoa", 200_000, new ConsumptionTaxStrategy(), calculator, new TaxExemptState()
        );
        double exemptTotal = exemptProduct.calculate();
        System.out.printf("  %s - Tong sau thue: %.0f VND%n", "Sach giao khoa", exemptTotal);
        System.out.println();
    }

    private static void demoPaymentSystem() {
        System.out.println("=== 3) He thong thanh toan ===");

        PaymentComponent pricingRule = new DiscountDecorator(
                new ProcessingFeeDecorator(new BasePaymentComponent())
        );

        PaymentContext paymentByCard = new PaymentContext(
                2_000_000, new CreditCardStrategy(), pricingRule
        );
        paymentByCard.process();
        System.out.println("  -> Trang thai cuoi: " + paymentByCard.getCurrentState());

        PaymentContext paymentByPaypal = new PaymentContext(
                6_500_000, new PayPalStrategy(), pricingRule
        );
        paymentByPaypal.process();
        System.out.println("  -> Trang thai cuoi: " + paymentByPaypal.getCurrentState());
        System.out.println();
    }

    private static void printConclusion() {
        System.out.println("=== Ket luan ===");
        System.out.println("- State giup mo hinh hoa luong nghiep vu theo trang thai ro rang, de mo rong.");
        System.out.println("- Strategy giup thay doi thuat toan linh hoat tai runtime (kiem tra, tinh thue, thanh toan).");
        System.out.println("- Decorator giup bo sung tinh nang (log, thong bao, phi, giam gia) ma khong sua lop goc.");
        System.out.println("- Ket hop 3 pattern tao he thong mem deo va tuan thu nguyen ly OCP.");
    }
}