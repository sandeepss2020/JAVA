package hotel_manage;

import java.util.Scanner;

public class rating 
{
	
	static Scanner object = new Scanner(System.in);
	
	//instance variables (inside class outside method)
	static int hotel_id;
	static String hotel_name;
	int rating_num ;
	String hotel_add;
	private float discount;
	static boolean flag = false;
	
	public static int hotel_details()
	{
		rating rat = new rating();
		System.out.println("Enter Hotel Id:");
		hotel_id = object.nextInt();
		object.nextLine(); // waiting for next line.
		System.out.println("Enter Hotel Name:");
		hotel_name = object.nextLine();
//		System.out.println();
		System.out.println("Enter Hotel Address:");
		rat.hotel_add = object.nextLine();
		System.out.println("Hotel Details");
		System.out.println("Hotel Name  : " +hotel_name);
		System.out.println("Hotel Address  : " +rat.hotel_add);
		flag = true;
		return hotel_id;
	}
	
	void showratings() 
	 {
		int rating;
		//local variables.
		String name;
	   	System.out.println("Enter Your Name : ");
	   	String get_name = object.nextLine();
	   	System.out.println("Enter Hotel id for Rating: ");
	   	int chk_hotel_id = object.nextInt();
	   	if (flag)
	   	{
	   		System.out.println("Enter Your Ratings :");
	   		rating = object.nextInt();
	   	}
	   	System.out.println("Hotel Ratings Updated ");
	   	System.out.println("Hotel Id :" +chk_hotel_id );
	   	System.out.println("Hotel Name : " +hotel_name);
	   	System.out.println("Rating : ");
	  }
			
		
		
		
		
		
		
	
public static void main(String[] args)
{
	while(true)
	{
	System.out.println("Enter 1 to Give Hotel Details and 2 For Ratings :");
	int num = object.nextInt();
	
	
		switch (num) {
		case 1: {
				hotel_details();
				break;
				}
			
		case 2: {
				rating rat = new rating();
				rat.showratings();
				break;
				}
		case 3:
			System.exit(0);
			break;
			
		default:
			throw new IllegalArgumentException("Unexpected value: " + num);
		}
	}
	
}

}
