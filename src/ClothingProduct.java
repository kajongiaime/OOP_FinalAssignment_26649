class ClothingProduct extends InventoryManager {
    private String size;

    public ClothingProduct(String id,String name,double price,int qty,String c,String s,String l,String size){
        super(id,name,price,qty,c,s,l);
        this.size = size;
    }

    public String toString(){
        return super.toString() + " Size:" + size;
    }
}
