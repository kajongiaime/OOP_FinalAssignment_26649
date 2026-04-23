class PersonalCareProduct extends InventoryManager {
    private String skinType;

    public PersonalCareProduct(String id,String name,double price,int qty,String c,String s,String l,String skin){
        super(id,name,price,qty,c,s,l);
        skinType = skin;
    }

    public String toString(){
        return super.toString() + " Skin:" + skinType;
    }
}
