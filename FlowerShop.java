import java.util.Scanner;

class FlowerShop1 {
    private String[] flowers;
    private int[] quantities;

    public FlowerShop1(int capacity) {
        flowers = new String[capacity];
        quantities = new int[capacity];
    }

    public void addFlower(String flower, int quantity) {
        for (int i = 0; i < flowers.length; i++) {
            if (flowers[i] == null) {
                flowers[i] = flower;
                quantities[i] = quantity;
                System.out.println(quantity + " " + flower + "(s) added to the inventory.");
                return;
            } else if (flowers[i].equals(flower)) {
                quantities[i] += quantity;
                System.out.println(quantity + " more " + flower + "(s) added to the inventory.");
                return;
            }
        }
        System.out.println("Inventory is full. Cannot add more flowers.");
    }

    public void displayInventory() {
        System.out.println("Flower Inventory:");
        for (int i = 0; i < flowers.length; i++) {
            if (flowers[i] != null) {
                System.out.println(flowers[i] + ": " + quantities[i]);
            }
        }
    }
}

public class FlowerShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the capacity of the flower shop: ");
        int capacity = scanner.nextInt();
        FlowerShop flowerShop = new FlowerShop1(capacity);

        while (true) {
            System.out.println("\n1. Add Flowers\n2. View Inventory\n3. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter flower name: ");
                    String flower = scanner.next();
                    System.out.print("Enter quantity: ");
                    int quantity = scanner.nextInt();
                    flowerShop.addFlower(flower, quantity);
                    break;
                case 2:
                    flowerShop.displayInventory();
                    break;
                case 3:
                    System.out.println("Exiting Flower Shop Management System. Goodbye!");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
