/*Write code to create your own exception class. Create another class, and inside the main 
method, prompt the user to enter a number. If the number is less than 500, throw 
instances of your custom exception class.  */
class InvalidLessException extends Exception {
 InvalidLessException(String s) {
 super(s);
 }
 }
 class numberValidator {
 void validate(double number) throws InvalidLessException {
 if(number < 500) 
throw new InvalidLessException("invalid number");
 else
 System.out.println("valid number");
 }
 }
 public class exp7_3 {
 public static void main(String[] args) {
 numberValidator validator = new numberValidator();
 try {
 validator.validate(100);
 } catch (InvalidLessException e) {
 System.out.println(e.getMessage());
 }
 }}