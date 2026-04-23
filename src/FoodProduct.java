class FoodProduct extends InventoryManager {
    private String expiryDate;

    public FoodProduct(String id,String name,double price,int qty,String c,String s,String l,String e){
        super(id,name,price,qty,c,s,l);
        expiryDate = e;
    }

    public double calculateDiscount(){ return getPrice()*0.2; }

    public String toString(){
        return super.toString() + " Expiry:" + expiryDate;
    }
}
