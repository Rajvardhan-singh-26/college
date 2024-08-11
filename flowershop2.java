package flowershop2;
import flowershop1.FlowerShop;
import java.util.Scanner;
class Fl1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the capacity of the flower shop: ");
        int capacity = scanner.nextInt();
        FlowerShop flowerShop = new FlowerShop(capacity);

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
 