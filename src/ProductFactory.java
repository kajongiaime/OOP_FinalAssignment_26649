class ProductFactory {
    public static InventoryManager createProduct(String c,String id,String name,double price,int qty){
        switch(c.toLowerCase()){
            case "food": return new FoodProduct(id,name,price,qty,c,"S","A","2026");
            case "beverage": return new BeverageProduct(id,name,price,qty,c,"S","B",500);
            case "electronic": return new ElectronicProduct(id,name,price,qty,c,"S","C",12);
            case "clothing": return new ClothingProduct(id,name,price,qty,c,"S","D","M");
            case "cleaning": return new CleaningProduct(id,name,price,qty,c,"S","E","Liquid");
            case "personalcare": return new PersonalCareProduct(id,name,price,qty,c,"S","F","Oily");
            default: throw new IllegalArgumentException("Invalid category");
        }
    }
}
