/**
 * Arithmetic Demo for Week 3 of ICS111, by Lisa Miller
 * @author Cody Shitagi
 * @since 1/23/24
 */

public class ArithmeticDemo{
	/**
	 * main method
	 * not using args
	 */
	public static void main(String[] args){
		// System.out.println("hello Tuna");
		String s = "";
		int num1 = 65;
		int num2 = 2;
		int total;
		// + addition example
		total = num1 + num2;
		s = s + "\n" + num1 + " + " + num2 + " = " + total;
		// - subtration example
		total = num1 - num2;
		s = s + "\n" + num1 + " - " + num2 + " = " + total;
		// / division example
		total = num1 / num2;
		s = s + "\n" + num1 + " / " + num2 + " = " + total;
		// * multiplication example
		total = num1 * num2;
		s = s + "\n" + num1 + " * " + num2 + " = " + total;
		// % modulo example
		total = num1 % num2;
		s = s + "\n" + num1 + " % " + num2 + " = " + total;
		// order of operations example
		total = 4 + num2 * 5 % 10;
		s = s + "\n" + "4" + " + " + num2 + " * " + "5" + " % " + "10" + " = " + total;
		// displaying the examples nicely and centered.
		s = s + "\n";
		System.out.println(s);

	}
}
