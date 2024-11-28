package solid;

// CreditCardProcessor: Processes credit card payments
class CreditCardProcessor implements IPaymentProcessor {
    @Override
    public void processPayment(double amount) {
        System.out.println("Processing credit card payment Rs" + amount);
    }
}