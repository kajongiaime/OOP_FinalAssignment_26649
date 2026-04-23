public interface Sellable {
    void processSale(int qty);
    double calculateFinalPrice(int qty);
    void printReceipt();
}
