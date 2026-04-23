class CleaningProduct extends InventoryManager {
    private String chemical;

    public CleaningProduct(String id,String name,double price,int qty,String c,String s,String l,String chem){
        super(id,name,price,qty,c,s,l);
        chemical = chem;
    }

    public String toString(){
        return super.toString() + " Chemical:" + chemical;
    }
}
