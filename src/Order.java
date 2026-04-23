class Order {
    private String orderId;
    private Product product;
    private int qty;

    public Order(String id, Product p, int q){
        orderId=id; product=p; qty=q;
    }

    public double calculateTotal(){
        return product.getPrice() * qty;
    }
}
