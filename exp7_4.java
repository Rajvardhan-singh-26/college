/*Given two integers, 'a' and 'b' as input, compute 'a/b.' If 'a' and 'b' are not signed integers 
or if 'b' is zero, an exception will occur. Report the exception according to the sample 
Input/Output provided.*/
import java.util.Scanner;

public class exp7_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter the numerator (a): ");
            int a = sc.nextInt();

            System.out.print("Enter the denominator (b): ");
            int b = sc.nextInt();

            if (b == 0) {
                throw new ArithmeticException("Division by zero is not allowed.");
            }

            int result = a / b;
            System.out.println("Result of a/b: " + result);
        } catch (java.util.InputMismatchException e) {
            System.out.println("Exception: Input should be signed integers.");
        } catch (ArithmeticException e) {
            System.out.println("Exception: " + e.getMessage());
}
}
}