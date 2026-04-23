public class InventoryManager extends Product implements Sellable {
    private String supplierName;
    private String storageLocation;

    public InventoryManager() {}

    public InventoryManager(String id, String name, double price, int qty, String category,
                            String supplierName, String storageLocation) {
        super(id, name, price, qty, category);
        this.supplierName = supplierName;
        this.storageLocation = storageLocation;
    }

    public double calculateDiscount() { return getPrice() * 0.1; }
    public double applyTax() { return getPrice() * 0.18; }
    public boolean checkAvailability() { return getQuantity() > 0; }
    public double calculateTotalValue() { return getPrice() * getQuantity(); }

    public void updateStock(int amount) {
        if (amount > 0) setQuantity(getQuantity() + amount);
    }

    public boolean validateProduct() {
        return getPrice() > 0 && getQuantity() >= 0;
    }

    public String generateReport() { return "Report: " + toString(); }
    public String getCategoryDescription() { return "General Product"; }

    public void processSale(int qty) {
        if (qty > 0 && qty <= getQuantity()) {
            setQuantity(getQuantity() - qty);
        }
    }

    public double calculateFinalPrice(int qty) {
        return (getPrice() * qty) - calculateDiscount() + applyTax();
    }

    public void printReceipt() {
        System.out.println("Receipt: " + toString());
    }
}