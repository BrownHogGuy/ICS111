/** String Method Demo.
 *
 * @author Cody Shitagi
 * @since 02/06/2024
 */

public class StringMethodDemo {
   /** main Method.
    *
    * @param args not in use
    */

   public static void main(String[] args) {
      System.out.println("hello tuna");
      String s1 = new String("cat");
      String s2 = new String("dog");
      String sCat = s1.concat(s2);
      // Length of the string
      int length = s1.length();
      System.out.println("length of " + s1 + " is: " + Length);

      //Character at a specific index
      char charAtIndex2 = s2.charAt(2);
      System.out.println("char of " + s2 + " at index 2: " + charAtIndex2);

      // Substring
      String substring = sCat.substring(2, 4);
      System.out.println("substring of " + sCat + " between indices 2 and 4: " + substring);

      // Concatenation
      String concatenated = sCat.concat(" what is up?");
      System.out.println("concatenation of " + sCat + " with 'what is up': " + concatenated);

      // Converting to uppercase, lowercase is similar just replace the Upper with Lower
      String uppercase = s1.toUpperCase();
      System.out.println("Converting " + s1 + " to upper: " + uppercase);

      // Check for substring
      boolean containsWord = sCat.contains(s1);
      System.out.println("Checking " + sCat + " to see if it contains " + s1 + ": " + containsWord);

      // Finding index of a substring
      int indexOfCat = sCat.indexOf(s1);
      System.out.println("Index of " + s1 + " within " + sCat + " is: " + indexOfCat);

      // Replacing a substring
      String replaced = sCat.replace("at", "orn");
      System.out.println("Of " + sCat + " We replaced 'at' for 'orn': " + replaced);

      checkTrim("fuck this");
   } // close main
   
   /** Method to checkTrim.
    *
    * @param word takes a String
    */

   public static void checkTrim(String word) {
      String word = word;
      int bLength = word.Length();
      String tryTrim = word.Trim();
      int aLength = tryTrim.Lenght();
      System.out.println();
      System.out.println("The string '" + word + "' is " + bLength + "characters long.");
      System.out.println("The string '" + tryTrim + "' is " + aLength + "characters long.");
      System.out.println();
   }
} // close class
