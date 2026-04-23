class BeverageProduct extends InventoryManager {
    private double volume;

    public BeverageProduct(String id,String name,double price,int qty,String c,String s,String l,double v){
        super(id,name,price,qty,c,s,l);
        volume = v;
    }

    public double applyTax(){ return getPrice()*0.1; }

    public String toString(){
        return super.toString() + " Volume:" + volume;
    }
}
