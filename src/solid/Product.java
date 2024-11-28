package solid;

    import java.util.*;

    // Single Responsibility Principle (SRP)
    // Product Class:- Manages product information and stock
    class Product implements IStockManager {
        private String name;
        private double price;
        private int stock;

        // Constructor
        public Product(String name, double price, int stock) {
            this.name = name;
            this.price = price;
            this.stock = stock;
        }

        // Getter for product details
        public String getDetails() {
            return "Product: " + name + ", Price: Rs " + price + ", Stock: " + stock;
        }

        // Reduce stock by specified quantity
        public void reduceStock(int quantity) {
            if (quantity <= stock) {
                stock -= quantity;
            } else {
                System.out.println("Not enough stock available");
            }
        }

        // Implementing IStockManager interface
        @Override
        public boolean checkStock(int quantity) {
           /* if (stock >= quantity){
                return true;
        }
            else{return false;
                }

            */
            return stock >= quantity;
        }

        @Override
        public void updateStock(int quantity) {
            stock -= quantity;
        }

        public double getPrice() {
            return price;
        }

        public int getStock() {
            return stock;
        }

        public String getName() {
            return name;
        }
    }





