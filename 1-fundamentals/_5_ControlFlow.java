/**
* This class will demonstrate basic control flow.
* It will include if else statments and switch statements.
*
* @author David Lu
* @since Oct 15 2025
*/
public class _5_ControlFlow
{
  /**
  * Default Constructor.
  */
  public _5_ControlFlow(){}
  
  /**
  * Main Method.
  * Uses if else statements and switch statments to control flow of operations.
  * 
  * @param args command-line arguments passed to the method.
  */
  public static void main(String[] args)
  {
    int value = 10; int number = 5;
    switch (value)
    {
      case 5:
	      System.out.println("case one ran");
	      break;
	    case 10:
		    System.out.println("case two ran");
		    break;
	    case 15:
		    System.out.println("case three ran");
		    break;
	    default;
		    System.out.println("default case ran");
    }
    
    if(value == 10) {System.out.println("value = 10");} //== equal operator
    if(value != 10) {System.out.println("value = 10");} //!= not equal operator
    if(value >= 10) {System.out.println("value = 10");} //<= less than or equal operator
    if(value <= 10) {System.out.println("value = 10");} //>= greater than or equal operator
    if(value > 10) {System.out.println("value = 10");} //> greater than operator
    if(value < 10) {System.out.println("value = 10");} //< less than operator

    if(value == 10 && number == 5) {System.out.println("both were true");} //&& and operator
    if(value == 10 || number == 5) {System.out.println("both were true");} //&& and operator

    if(value == 5)
    {
      System.out.println("if was true");
    }
    else if(value == 10)
    {
      System.out.println("else if was true");
    }
    else
    {
      System.out.println("neither were true");
    }
  }
}
