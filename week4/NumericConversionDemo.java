/** Numeric Conversion Demo
 *
 * @author Cody Shitagi
 * @since 1/30/24
 *
 */

public class NumericConversionDemo {

  /**
   * main method, void.
   * <p>
   * Args is not in use.
   * </p>
   */
  public static void main(String[] args){
    // System.out.println("Hellow Tuna");
    int num1 = 5;
    int num2 = 6;
    int num3 = 2;

    int total = num1 + num2 * num3;
    System.out.println("It follows PEMDAS: " + "total = num1 + num2 * num3");
    // since double is 64 and int is 32 it following code would preform a Lossy Compression Error.
    // this means that the 64 bit and 32 bit will have data loss if the operation went through.
    // double dNum1 = 1.1;
    // total = num1 * dNum1

  } // closes main
}  // closes class
