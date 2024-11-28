package solid;


// OrderProcessor: Processes order and handles payment
class OrderProcessor {
    private IPaymentProcessor paymentProcessor;
    private InvoiceGenerator invoiceGenerator;

    // Constructor with dependency injection
    public OrderProcessor(IPaymentProcessor paymentProcessor, InvoiceGenerator invoiceGenerator) {
        this.paymentProcessor = paymentProcessor;
        this.invoiceGenerator = invoiceGenerator;
    }

    // Process the order and payment
    public void processOrder(Order order, String paymentType) {
        // Generating invoice
        String invoice = invoiceGenerator.generateInvoice(order);
        System.out.println(invoice);

        // Calculate total order amount
        double totalAmount = 0;
        for (OrderItem item : order.getItems()) {
            totalAmount += item.getProduct().getPrice() * item.getQuantity();
        }
        // Process payment
        paymentProcessor.processPayment(totalAmount);

        // Update stock after payment
        for (OrderItem item : order.getItems()) {
            item.getProduct().reduceStock(item.getQuantity());
        }
    }
}
