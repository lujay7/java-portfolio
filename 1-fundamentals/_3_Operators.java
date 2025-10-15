/**
* This class will demonstrate how to use java operators.
* It will print out different java operations.
*
* @author David Lu
* @since Oct 15 2025
*/
public class _3_Operators
{
  /**
  * Most classes should include a default constructor.
  */
  public _3_Operators(){}
  
  /**
  * Main Method.
  * Declares several integers and performs operations on them.
  * 
  * @param args command-line arguments passed to the method.
  */
  public static void main(String[] args)
  {
    int x = 50;
    int y = 100;
    int z = 2;
    int sum = x + y; //50 + 100 equals 150.
    System.out.println(sum);
    int minus = y - x; //100 - 50 equals 50.
    System.out.println(minus);
    int multiply = x * y; //50 * 2 equals 100.
    System.out.println(multiply);
    int divide = y / z; //100 / 2 equals 50.
    System.out.println(divide);
    z++; //increases the value of z by 1.
    z--; //decreases the value of z by 1.
    z += 1; //increases the value of z by 1;
    int mod = x % z; //50 mod 3 returns 2.
    System.out.println(mod);
  }
}
