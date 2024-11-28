package solid;

// Interface for stock management (ISP)
interface IStockManager {
    boolean checkStock(int quantity);
    void updateStock(int quantity);
}
