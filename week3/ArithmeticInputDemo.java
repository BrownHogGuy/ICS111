import java.util.Scanner;       // imported packages
/** Arithmetic Input Demo.
 *
 * @author Cody Shitagi
 * @since 1/25/24
 */

public class ArithmeticInputDemo {
  /**
  * Main Method
  * args not in use.
  */
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    // Instructions
    System.out.println("Give me a number: ");
    String temp;
    temp = scan.nextLine();
    System.out.println("Your number: " + temp);
    final double num1 = Double.parseDouble(temp);

    System.out.println("Give me another number: ");
    temp = scan.nextLine();
    System.out.println("Your number: " + temp);
    final double num2 = Double.parseDouble(temp);
    
    double total = num1 + num2;
    System.out.println("Algorithmn via adding your two numbers together...\n\nSum: " + total);
    
  }
}
