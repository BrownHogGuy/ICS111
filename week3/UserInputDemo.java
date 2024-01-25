import java.util.Scanner;       // imported packages
/** User input Demo.
 *
 * @author Cody Shitagi
 * @since 1/25/24
 */

public class UserInputDemo {
  /**
  * Main Method
  * args not in use.
  */
  public static void main(String[] args) {
    // variables 
    Scanner scan = new Scanner(System.in);
    String userIn;
    String firstName;

    // instructions
    System.out.println("Please Enter your first name");
    userIn = scan.nextLine();   // This gets input from user via console. 
    firstName = userIn;
    System.out.println("You first name is: " + firstName);

    System.out.println("Please Enter your last name");
    userIn = scan.nextLine();   // This gets input from user via console. 
    String lastName = userIn;
    System.out.println("Your last name is: "  + lastName);

    System.out.println("Your whole name is: " + firstName + " " + lastName);
  } // closing main
} // closing class
