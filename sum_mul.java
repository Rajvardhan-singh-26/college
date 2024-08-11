import java.util.Scanner;

public class sumofsquare Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[10];
        int SumOfSquares = 0;

        System.out.println("Enter 10 numbers:");
        for (int i = 0; i < 10; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            numbers[i] = scanner.nextInt();
        }

        for (int i = 0; i < 10; i++) {
            int square = numbers[i] * numbers[i];
            SumOfSquares += square;
        }
        System.out.println("Sum of squares: " + SumOfSquares);
    }
}
