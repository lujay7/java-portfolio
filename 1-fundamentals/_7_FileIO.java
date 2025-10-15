//Imports classes and packages from java.
import java.util.*;
import java.io.*;

/**
* This class demonstrates how to input and output data in java with user input and files.
* It contains use of the scanner class, the bufferedreader class, and the filereader class.
* This class also shows how to use try catch to prevent errors from occuring
*
* @author David Lu
* @since Oct 15 2025
*/
public class _7_FileIO
{
  /**
  * Default Constructor.
  */
  public _7_FileIO(){}
  
  /**
  * Main Method.
  * Creates a scanner object and inputs a value.
  * Creates a bufferedreader object and reads text from a file.
  * 
  * @param args command-line arguments passed to the method.
  */
  public static void main(String[] args)
  {
    //Creates a scanner object to take an input
    Scanner scanner = new Scanner(System.in);
    System.out.print("What is your name?");
    String name = scanner.nextLine();
    System.out.println();
    System.out.println("Your name is: " + name);

    System.out.println();
    try(BufferedReader reader = new BufferedReader(new FileReader("readFile.txt")))
    {
      String line;
      while(line == reader.readLine() != null)
      {
        System.out.println(line);
      }
    }
    catch(IOException e)
    {
      System.out.println("Was not able to read File: " + e.getMessage());
    }
  }
}
