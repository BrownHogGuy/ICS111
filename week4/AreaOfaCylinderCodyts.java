import java.util.Scanner;

/** Assignmnet 3; displaying the answer of the formula of Area of a Cylinder.
 *
 * @author Cody Shitagi
 * @since 1/30/24
 */

public class AreaOfaCylinderCodyts {
  public static final double PI = 3.14159;
  /** 
   * The main, where code is ran.
   * <p>
   * Method does not use args.
   * </p>
   */

  public static void main(String[] args) {
    // System.out.println("Hello Tuna");
    Scanner scan = new Scanner(System.in);
    String userIn;
    
    System.out.println("Please enter the radius of your cylinder:");
    userIn = scan.nextLine();
    // https://www.digitalocean.com/community/tutorials/java-convert-string-to-double
    // How to convert String to double
    final double radius = Double.parseDouble(userIn);
    System.out.println("You entered the radius of: " + radius);

    System.out.println("Please enter the height of your cylinder:");
    userIn = scan.nextLine();
    final double height = Double.parseDouble(userIn);
    System.out.println("You entered the height of: " + height);
  
    double area = 0.0;
    area = 2 * PI * radius * (height + radius);

    System.out.print("The area of a cylinder of radius " + radius);
    System.out.print(" and height " + height);
    System.out.print(" is ");
    // https://www.baeldung.com/java-printstream-printf
    // Section 7.2; FLoat and Double Formatting
    System.out.printf("%.2f", area);
  } // closing main
} // Closing public class
