import java.util.Scanner;
public class DigitCombinations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first digit (0 - 9): ");
        int digit1 = scanner.nextInt();

        System.out.print("Enter the second digit (0 - 9): ");
        int digit2 = scanner.nextInt();

        System.out.print("Enter the third digit (0 - 9): ");
        int digit3 = scanner.nextInt();

        if (isValidDigit(digit1) && isValidDigit(digit2) && isValidDigit(digit3)) {
            System.out.println("All possible combinations:");

            for (int i = digit1; i <= digit3; i++) {
                for (int j = digit1; j <= digit3; j++) {
                    for (int k = digit1; k <= digit3; k++)
                        System.out.println(i + "" + j + "" + k);
                    
}
                }
            }
        } else {
            System.out.println("Invalid input. Please enter digits between 0 and 9.");
        }
    }

    // Function to check if a number is a valid digit (0 - 9)
    public static boolean isValidDigit(int digit) {
        return digit >= 0 && digit <= 9;
    }
}