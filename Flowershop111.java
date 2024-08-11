//flower shop management system
import java.util.Scanner;
class FlowerShop { 
    private String[] flowers;
    //Array to store flower's name
    private int[] quantities;
    //array for quantity
    //constructor to initialize flower and quantity array with given capacity
    public FlowerShop(int capacity) {
        flowers = new String[capacity];
        quantities = new int[capacity];

    }
    // Method to add flower to inventory
    public void addFlower(String flower, int quantity) {
        //loop for flowers array
        for (int i = 0; i < flowers.length; i++) {
            //if flower = null /empty ,then add flower and quantity
            if (flowers[i] == null) {
                flowers[i] = flower;
                quantities[i] = quantity;
                System.out.println(quantity + " " + flower + "'s added to the inventory.");
                return;
                //if flower alredy exisrs , then update the quantity
            } else if (flowers[i].equals(flower)) {
                quantities[i] += quantity;
                System.out.println(quantity + " more " + flower + "'s added to the inventory.");
                return;
            }
        }
         // If the inventory is full and the flower doesn't exist, display a message
        System.out.println("Inventory is full ");
    }
    // Method to display the current flower inventory
    public void displayInventory() {
        System.out.println("Flower Inventory : ");
        // Iterate through the flowers array and display non-null entries
        for (int i = 0; i < flowers.length; i++) {
            if (flowers[i] != null) {
                System.out.println(flowers[i] + ": " + quantities[i]);
            }
        }
    }
}// Main class to provide user interface for Flower Shop Management System
public class Flowershop111 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter total capacity : ");
        int capacity = scanner.nextInt();
        FlowerShop flowerShop = new FlowerShop(capacity);
        // Menu-driven loop to interact with the Flower Shop
        while (true) {
            System.out.println("\n1. Add Flowers\n2. View Inventory\n3. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                //add flower
                    System.out.print("Enter flower name: ");
                    String flower = scanner.next();
                    System.out.print("Enter quantity: ");
                    int quantity = scanner.nextInt();
                    flowerShop.addFlower(flower, quantity);
                    break;
                case 2:
                //view inventory
                    flowerShop.displayInventory();
                    break;
                case 3:
                //to exit code
                    System.out.println("Exiting .......\nGoodbye!:)");
                    System.exit(0);
                default:
                //invaalid choice
                    System.out.println("Invalid choice");
            }
        }
    }
}
