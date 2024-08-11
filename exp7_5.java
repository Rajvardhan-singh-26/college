/*Implement a calculator to compute the power of a number. Create a class 'Calc' with a 
single method 'long power(int a, int b).' This method takes two integers 'a' and 'b' as 
parameters and finds 'a^b.' If either 'a' or 'b' is negative, the method should throw an 
exception with the message "a and b should not be negative." If both 'a' and 'b' are zero, 
the method should throw an exception with the message "a and b should not be zero."
5
 */
import java.util.Scanner;
import java.lang.Math;
import java.lang.Exception;

class Myexception extends Exception {
  Myexception(String s) {
    super(s);
  }
}

class Calc {
  void power(int a, int b) throws Myexception {
    if (a == 0 && b == 0) {
      throw new Myexception("Numbers cannot be zero");
    } else if (a < 0 || b < 0) {
      throw new Myexception("Numbers cant be negative");
    } else {
      System.out.println(Math.pow(a, b));
    }
  }
}

class exp7_5{
  public static void main(String[] args) {
    Calc f = new Calc();
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter numbers a and b");
    int a = sc.nextInt();
    int b = sc.nextInt();

    try {
      f.power(a, b);
    } catch (Myexception e) {
      System.out.println(e);
}

}
}