class ElectronicProduct extends InventoryManager {
    private int warranty;

    public ElectronicProduct(String id,String name,double price,int qty,String c,String s,String l,int w){
        super(id,name,price,qty,c,s,l);
        warranty = w;
    }

    public String toString(){
        return super.toString() + " Warranty:" + warranty;
    }
}
