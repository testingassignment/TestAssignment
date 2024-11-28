package solid;

// OrderItem Class: Represents a product and its quantity in the order
class OrderItem {
    private Product product;
    private int quantity;

    // Constructor
    public OrderItem(Product product, int quantity) {
        this.product = product;
        this.quantity = quantity;
    }

    public Product getProduct() {
        return product;
    }

    public int getQuantity() {
        return quantity;
    }
}