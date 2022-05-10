package hotel_manage;
import java.io.*;

//example of checked exception : 
class lab9 
{
public static void check()
{
	try {
	
		try {

	      // code that generate exception
			int divideByZero = 5 / 0;
			System.out.println("Rest of code in try block");
	    	}
	    
	    catch (ArrayIndexOutOfBoundsException e) {
	      System.out.println("ArrayIndexOutOfBound => " + e.getMessage());
	      System.out.println("Inner Block 2");
	    		  
	    }
	
		finally
		{
			System.out.println("only examples are given.");
		}
	}
	catch (ArithmeticException e) {
	      System.out.println("ArithmeticException => " + e.getMessage());
	      System.out.println("Inner Block 1");
	    }
		finally
		{
			System.out.println("Compiled Successfully...");
		}
	}


  
  public static void findFile() throws IOException {

    File newFile = new File("test.txt");
    FileInputStream stream = new FileInputStream(newFile);
  }

  public static void main(String[] args)
{
    try {
    	check();
      findFile();
      
    }
    catch (IOException e) {
      System.out.println(e);
    }
  }
}
