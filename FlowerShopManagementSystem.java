import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Flower {
    private String name;
    private double price;
    private int quantity;

    public Flower(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}

class FlowerShop {
    private List<Flower> inventory;

    public FlowerShop() {
        this.inventory = new ArrayList<>();
    }

    public void addFlower(String name, double price, int quantity) {
        Flower flower = new Flower(name, price, quantity);
        inventory.add(flower);
    }

    public void listInventory() {
        System.out.println("Flower Inventory:");
        for (Flower flower : inventory) {
            System.out.println(flower.getName() + " - Price: $" + flower.getPrice() + " - Quantity: " + flower.getQuantity());
        }
    }

    public void processOrder(String name, int quantity) {
        for (Flower flower : inventory) {
            if (flower.getName().equalsIgnoreCase(name)) {
                if (flower.getQuantity() >= quantity) {
                    double totalPrice = flower.getPrice() * quantity;
                    System.out.println("Order Details:");
                    System.out.println("Flower: " + flower.getName());
                    System.out.println("Quantity: " + quantity);
                    System.out.println("Total Price: ₹" + totalPrice);

                    flower.setQuantity(flower.getQuantity() - quantity);
                    return;
                } else {
                    System.out.println("Insufficient stock for " + flower.getName());
                    return;
                }
            }
        }
        System.out.println("Flower not found: " + name);
    }
}

public class FlowerShopManagementSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        FlowerShop flowerShop = new FlowerShop();

        // Add some initial flowers to the inventory
        flowerShop.addFlower("Rose", 10.0, 202);
        flowerShop.addFlower("Tulip", 8.0, 1500);
        flowerShop.addFlower("Lily", 12.0, 1005);

        while (true) {
            System.out.println("\nFlower Shop Management System");
            System.out.println("1. List Inventory");
            System.out.println("2. Place Order");
            System.out.println("3. Exit");
            System.out.print("Select an option: ");

            int choice = scanner.nextInt();
            scanner.nextLine();  // Consume newline

            switch (choice) {
                case 1:
                    flowerShop.listInventory();
                    break;
                case 2:
                    System.out.print("Enter flower name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter quantity: ");
                    int quantity = scanner.nextInt();
                    scanner.nextLine();  // Consume newline
                    flowerShop.processOrder(name, quantity);
                    break;
                case 3:
                    System.out.println("Exiting Flower Shop Management System. Thank you!");
                    System.exit(0);
                default:
                    System.out.println("Invalid option. Please try again.");
                    break;
            }
        }
    }
} 