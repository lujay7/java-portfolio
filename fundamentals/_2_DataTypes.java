/**
* This class demonstrates the six simple data types in Java.
* It will print the different data types.
*
* @author David Lu
* @since Oct 8 2025
*/
public class _2_DataTypes
{
  /**
  * Default Constructor
  */
  public _2_DataTypes(){}
  
  /**
  * Main Method
  * Declares and initializes the six simple data types and prints them out
  *
  * @param args command-line arguments passed to the method.
  */
  public static void main(String[] args)
  {
    //Both objects and primitive types can be both declared and initialized.
    //If an object is declared but not initialized then the value is null.
    
    //A String is an object and is not a primitive type.
    String s; //declaring an object (s == null)
    s = "I am a String"; //initializing the object
    String t = "and i can be concatenated with +"; //both at the same time
    System.out.println(s + " " + t);
    
    //An Integer is a primitive data type. It can be any integer from -2^31 to 2^31 {-2, -1, 0, 1, 2, etc.}
    int x = 10;
    System.out.println("I am an Integer: " + x);

    //A Float is another primitive data type. It includes decimals up to 7 places.
    float y = 5.7654321;
    System.out.println("I am a Float: " + y);

    //A Double is another primitive data type. It includes decimals up to 15 places.
    double z = 5.987654321054321;
    System.out.println("I am a Double: " + z);

    //A Character is another primitive data type. It can be any character and is always length one.
    char a = 'c';
    char b = 'Z';
    char c = '&';
    System.out.println("We are Characters: " + a + " " + b + " " + c);

    //A Boolean is another primitive data type. It is always a true or false statement.
    boolean isFull = false;
    boolean isRaining = true;
    System.out.println("We are Booleans:" + isFull + " " + isRaining);
  }
}
