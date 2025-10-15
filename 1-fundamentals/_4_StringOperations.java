/**
* This class will demonstrate basic string operations.
* It will print different string operation outputs.
*
* @author David Lu
* @since Oct 15 2025
*/
public class _4_StringOperations
{
  /**
  * Default Constructor.
  */
  public _4_StringOperations(){}
  
  /**
  * Main Method.
  * Declares a string and uses string operations.
  * 
  * @param args command-line arguments passed to the method.
  */
  public static void main(String[] args)
  {
    String one = "apple";
    System.out.println(one.startsWith("a")); //Returns a boolean if the string starts with "a".
    System.out.println(one.endsWith("a")); //Returns a boolean if the string ends with "a".
    System.out.println(one.length()); //Returns the length of the string.
    System.out.println(one.indexOf("a")); //Returns the first index of the character "a".
    one.replace("a", "b"); //Replaces all occurances of "a" with "b".
    one.toUpperCase(); //Changes all characters to uppercase.
    System.out.println(one);
    one.toLowerCase(); //Changes all characters to lowercase.
    System.out.println(one);
    System.out.println(one.charAt(0)); //Returns the character at index 0.
    System.out.println(one.equals("apple")); //Compares Strings and returns if they are equal or not.
    System.out.println(one.substring(0,2)); //Returns a substring from index 0 to index 2.
    System.out.println(one.contains("a")); //Returns if the string contains "a" or not.
    one.concat(" and orange    "); //Combines the two strings together;
    System.out.println(one);
    one.trim(); //Removes extra spaces from string and trims it.
    System.out.println(one);
  }
}
