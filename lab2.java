package hotel_manage;
import java.util.*;

public class lab2 {
	static Scanner object = new Scanner(System.in);
	
	public class rating
	{
		//instance variables (inside class outside method)
		static int hotel_id;
		static String hotel_name;
		int rating_num ;
		String hotel_add;
		private float discount;
		
		public static int hotel_details()
		{
			System.out.println("Enter Your Hotel Details :");
			rating rat1 = new lab2().new rating();
			System.out.println("Enter Hotel Id:");
			hotel_id = object.nextInt();
			System.out.println("Enter Hotel Name:");
			hotel_name = object.nextLine();
			System.out.println();
			System.out.println("Enter Hotel Address:");
			rat1.hotel_add = object.nextLine();
			System.out.println();
			System.out.println("Enter The Discount %age:");
			rat1.discount = object.nextFloat();
			System.out.println("=============================");
			System.out.println("Hotel Id : " +hotel_id);
			System.out.println("Hotel Name: " +hotel_name);
			System.out.println("Address is -> " +rat1.hotel_add);
			System.out.println("Discount Going on is " +rat1.discount);
			return hotel_id;
		}
//		
		
	    void showratings() 
	    {
	    	System.out.println("Enter Hotel Ratings Below :");
	    	//local variables.
	    	String name;
	    	System.out.println("Enter Your Name : ");
	    	String get_name = object.nextLine();
	    	System.out.println("Enter The hotel id :");
	    	int g_id = object.nextInt();
	    	System.out.println("Enter The Number of days You stayed:");
	    	int g_stay = object.nextInt();
	    	System.out.println("Enter Rating You Want yo give :");
	    	float g_rating = object.nextFloat();
	    	
	    	System.out.println("===============================");
	    	System.out.println("Customer Name : " +get_name );
	    	System.out.println("Hotel id is : " +g_id );
	    	System.out.println("Hotel Rating : " +g_rating );
	    }
		
	}
	
//	public class customers
//	{
//		static int cust_id;
//		static String cust_name;
//		long cust_aadhar;
//		Date check_in;
//		Date check_out;
//		
//		
//		int get_bill() 
//		{
//			final int amount = 0 ;
//			return amount;
//		}
//		}

	public static void main(String[] args) 
	{
		lab2 obj = new lab2();
		lab2.rating rat = obj.new rating(); 
		rat.hotel_details();
		rat.showratings();
		
	}

}
