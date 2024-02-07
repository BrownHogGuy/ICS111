/** Static Method Demonstration
 *
 * @author Cody Shitagi
 * @since 2/1/24
 */

public class StaticMethodDemo {
  /** main Method.
   * 
   * <p>does not use args</p>
   */

  public static void main(String[] args) {
    System.out.println("hi");
    add(5, 4);
  }
  public static void add(int num1, int num2) {
    System.out.println("adding: " + num1 + " + " + num2 + " = " + (num1 + num2));
  }

}
