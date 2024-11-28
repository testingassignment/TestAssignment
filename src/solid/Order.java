package solid;

import java.util.ArrayList;
import java.util.List;

class Order {
    private Customer customer;
    private List<OrderItem> items;

    // Constructor
    public Order(Customer customer) {
        this.customer = customer;
        this.items = new ArrayList<>();
    }

    // Add an item to the order
    public void addItem(OrderItem item) {
        items.add(item);
    }

    // Get the customer associated with the order
    public Customer getCustomer() {
        return customer;
    }

    // Get the list of items in the order
    public List<OrderItem> getItems() {
        return items;
    }
}