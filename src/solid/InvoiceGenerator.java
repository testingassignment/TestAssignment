package solid;

// InvoiceGenerator Class: Generates an invoice for the order
class InvoiceGenerator {
    public String generateInvoice(Order order) {
        StringBuilder invoice = new StringBuilder();
        invoice.append("Invoice for Order\n");
        invoice.append("Customer class detail : " + order.getCustomer().getContactInfo() + "\n");

        double totalAmount = 0;
        invoice.append("Items Purchased:\n");

        for (OrderItem item : order.getItems()) {
            Product product = item.getProduct();
            invoice.append(product.getDetails() + " x " + item.getQuantity() + "\n");
            totalAmount += product.getPrice() * item.getQuantity();
        }

        invoice.append("Total Amount: Rs" + totalAmount);
        return invoice.toString();
    }
}