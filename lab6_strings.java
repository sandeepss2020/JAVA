package hotel_manage;

import java.util.Scanner;
class logins
{
	Scanner sr = new Scanner (System.in);
	String uname;
	String phone;
	StringBuffer pass  = new StringBuffer("Password");
	StringBuilder str1 = new StringBuilder("-------");
	void getdetails()
	{
		System.out.println("Enter Your Name :");
		String name = sr.nextLine();
		System.out.println("Enter Username:");
		uname = sr.next();
		System.out.println("Enter Phone Number :");
		phone = sr.nextLine();
		
		// How to Concatenate string buffer 
		System.out.println("Enter Password : ") ;
		String pass1 = sr.next();
	}
	
	void checkdetails()
	{
		System.out.println("Enter Login Details : ");
		
		System.out.println("Check details");
	}
}


public class lab6_strings 
{
	
	public static void main(String[] args) 
	{
		Scanner src = new Scanner (System.in);
		System.out.println("For New Registration : 1. For Login : 2");
		System.out.println("For EXIT Press 3");
		int num = src.nextInt();
		logins log = new logins();
		switch (num)
		{
		case 1:
			log.getdetails();
			break;
		case 2:
			log.checkdetails();
			break;
		case 3:
			break;
		default:
			System.out.println("Please Enter A Valid Input.");
			break;
		}

	}

}
