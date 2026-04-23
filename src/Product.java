public abstract class Product {
    private String productId;
    private String productName;
    private double price;
    private int quantity;
    private String category;

    public Product() {}

    public Product(String productId, String productName, double price, int quantity, String category) {
        this.productId = productId;
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;
        this.category = category;
    }

    public String getProductId() { return productId; }
    public String getProductName() { return productName; }
    public double getPrice() { return price; }
    public int getQuantity() { return quantity; }
    public String getCategory() { return category; }

    public void setProductId(String id) { this.productId = id; }
    public void setProductName(String name) { this.productName = name; }
    public void setPrice(double price) { this.price = price; }
    public void setQuantity(int qty) { this.quantity = qty; }
    public void setCategory(String category) { this.category = category; }

    public String toString() {
        return productId + " " + productName + " " + price + " " + quantity + " " + category;
    }

    abstract double calculateDiscount();
    abstract double applyTax();
    abstract boolean checkAvailability();
    abstract double calculateTotalValue();
    abstract void updateStock(int amount);
    abstract boolean validateProduct();
    abstract String generateReport();
    abstract String getCategoryDescription();
}
