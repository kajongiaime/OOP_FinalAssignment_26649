import java.util.Scanner;

public class SupermarketSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String id,name,category;
        double price;
        int qty;
        System.out.print("Enter ID: ");
        id = sc.nextLine();

        System.out.print("Enter Name: ");
        name = sc.nextLine();

        System.out.print("Enter Price: ");
        price = Double.parseDouble(sc.nextLine());

        System.out.print("Enter Quantity: ");
        qty = Integer.parseInt(sc.nextLine());

        System.out.print("Enter Category: ");
        category = sc.nextLine();

        InventoryManager p = ProductFactory.createProduct(category,id,name,price,qty);

        p.processSale(1);
        p.printReceipt();
    }
}