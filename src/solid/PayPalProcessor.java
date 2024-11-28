package solid;

// PayPalProcessor: Processes PayPal payments
class PayPalProcessor implements IPaymentProcessor {
    @Override
    public void processPayment(double amount) {
        System.out.println("Processing PayPal payment Rs" + amount);
    }
}