class Customer {
    private String id, name, phone;

    public Customer(String id,String name,String phone){
        this.id=id; this.name=name; this.phone=phone;
    }

    public String toString(){
        return name + " (" + phone + ")";
    }
}
