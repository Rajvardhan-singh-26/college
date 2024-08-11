import java.util.ArrayList;
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
    private ArrayList<Flower> flowerInventory;

    public FlowerShop() {
        flowerInventory = new ArrayList<>();
    }
    public void addFlower(Flower flower) {
        flowerInventory.add(flower);
    }
    public void displayInventory() {
        System.out.println("Flower Inventory:");
        System.out.println("-------------------------------------------------");
        System.out.printf("%-15s %-10s %-10s\n", "Name", "Price", "Quantity");
        System.out.println("-------------------------------------------------");
        for (Flower flower : flowerInventory) {
            System.out.printf("%-15s %-10.2f %-10d\n", flower.getName(), flower.getPrice(), flower.getQuantity());
        }
        System.out.println("-------------------------------------------------");
    }
    public Flower findFlower(String name) {
        for (Flower flower : flowerInventory) {
            if (flower.getName().equalsIgnoreCase(name)) {
                return flower;
            }
        }
        return null;
    }
}
public class Flowershopmanagement2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        FlowerShop flowerShop = new FlowerShop();
        flowerShop.addFlower(new Flower("Rose", 15.66, 100));
        flowerShop.addFlower(new Flower("Lily", 99.98, 220));
        flowerShop.addFlower(new Flower("Marigold", 4.689, 890));
        int choice;
        do {
            System.out.println("\nFlower Shop Management System");
            System.out.println("1. Display Inventory");
            System.out.println("2. Add Flower");
            System.out.println("3. Update Flower Quantity");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    flowerShop.displayInventory();
                    break;
                case 2:
                    System.out.print("Enter flower name: ");
                    String flowerName = scanner.next();
                    System.out.print("Enter flower price: ");
                    double flowerPrice = scanner.nextDouble();
                    System.out.print("Enter flower quantity: ");
                    int flowerQuantity = scanner.nextInt();
                    Flower newFlower = new Flower(flowerName, flowerPrice, flowerQuantity);
                    flowerShop.addFlower(newFlower);
                    System.out.println("Flower added successfully!");
                    break;
                case 3:
                    System.out.print("Enter the name of the flower to update quantity: ");
                    String updateFlowerName = scanner.next();
                    Flower updateFlower = flowerShop.findFlower(updateFlowerName);
                    if (updateFlower != null) {
                        System.out.print("Enter the new quantity: ");
                        int newQuantity = scanner.nextInt();
                        updateFlower.setQuantity(newQuantity);
                        System.out.println("Quantity updated successfully!");
                    } else {
                        System.out.println("Flower not found in the inventory.");
                    }
                    break;
                case 4:
                    System.out.println("Exiting Flower Shop Management System. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
            }
        } while (choice != 4);
        scanner.close();
    }
}