package solid;

// Main Class to run the example
public class SolidPrincipleMain

 {
    public static void main(String[] args) {
        // Create products class object and assign the item and its quantity
        Product laptop = new Product("Laptop", 1000.00, 50);
        Product phone = new Product("Smartphone", 500.00, 100);

        // Create customer class object
        Customer customer = new Customer("Ravi", "ravi@solid.com", "Bangalore");

        // Create order and add items
        Order order = new Order(customer);
        order.addItem(new OrderItem(laptop, 1));
        order.addItem(new OrderItem(phone, 2));

        // Choose payment processor - by creating the payment processor object
        IPaymentProcessor paymentProcessor = new CreditCardProcessor();
        InvoiceGenerator invoiceGenerator = new InvoiceGenerator();

        // Create order processor object
        OrderProcessor orderProcessor = new OrderProcessor(paymentProcessor, invoiceGenerator);

        // Process the order
        orderProcessor.processOrder(order, "CreditCard");
    }
}
