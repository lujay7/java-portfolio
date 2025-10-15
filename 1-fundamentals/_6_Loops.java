/**
* This class shows how loops work in java.
* It will include for loops, while loops, and for each loops.
*
* @author David Lu
* @since Oct 15 2025
*/
public class _6_Loops
{
  /**
  * Default Constructor.
  */
  public _6_Loops(){}
  
  /**
  * Main Method.
  * Uses for loops, while loops, and for each loops.
  * 
  * @param args command-line arguments passed to the method.
  */
  public static void main(String[] args)
  {
    //For loop that iterates through 10 times.
    for(int i = 0; i < 10; i++)
    {
      System.out.println(i);
    }
    int i = 0;
    //While loop that iterates through 10 times.
    while(i < 10)
    {
      System.out.println(i);
      i++;
    }
    int[] hello = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
    //For each loop that iterates through the array.
    for(int num : hello)
    {
      System.out.println(num);
    }
  }
}
