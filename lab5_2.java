package hotel_manage;

public class lab5_2 
{

	public static void main(String[] args) 
	{
//		 System.out.println("Command-Line arguments are");
//		    // loop through all arguments
//		    for(String str: args) 
//		    {
//		      System.out.println(str);
//		    }
		
		for(String str: args) {
		      // convert into integer type
		    int argument = Integer.parseInt(str);
		    System.out.println("Argument in integer form: " + argument);
		    }
	}

}
