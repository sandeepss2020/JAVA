package hotel_manage;
import java.util.Scanner;
class hotel_details
{
	int hotel_id;
	String hotel_name;
	String hotel_add;
	static int hotel_contact;
	
	
	void hotel_details()
	{
		System.out.println("Welcome !! to the Poral.");
		hotel_contact = 7955451;
	}
	
	void hotel_details(int m)
	{
		hotel_id = 1111;
		hotel_name = "";
		hotel_add = "India";
	}
	
	int hotel_details(int a, int b)
	{
		int emergency_con = 100;
		hotel_contact = 14587;
		return emergency_con;
	}
	
	void get_hotel_details( int n,String arr[][])
	{
//		hotel_id = i;
//		hotel_name = hname;
		
		System.out.println("Updated Hotel Details");
		for(int j = 0; j< n ; j++)
		{
			System.out.println("=============================");
			for(int k = 0; k<1 ; k++)
			{
				System.out.println("Hotel Id  :  " +arr[j][k]);
				System.out.println("Name of the Hotel : " +arr[j][k+1]);
				System.out.println("Address is  : " +hotel_add);
				System.out.println("Contact Num :" +hotel_contact);
			}
		}
	}
}

public class lab3 
{
	public static void main(String[] args) 
	{
		Scanner src = new Scanner(System.in);
		hotel_details obj = new hotel_details();
		hotel_details obj2 = obj;
		hotel_details obj3 = new hotel_details();
		//lab3 obj2 = new lab3();
		
		obj.hotel_details();
		obj.hotel_details(1);
		System.out.println("Enter the number of inputs You want to enter :");
		int num = src.nextInt();
		String[][]arr = new String [num][2];
		for(int j = 0; j< num ; j++)
			{
				for(int k = 0; k<1 ; k++)
				{
					System.out.println("Hotel Id : ");
					arr[j][k] = String.valueOf(src.nextInt());
					src.nextLine();
					System.out.println("Hotel Name : ");
					arr[j][k+1] = src.nextLine();
				}
			}
		obj.get_hotel_details(num,arr);
		System.out.println("Emergency Contactv is : " +obj.hotel_details(1,1));
		obj2.hotel_contact = 875463103;
		System.out.println(obj.hotel_contact);
		obj3.hotel_add = "Bangalore";
		System.out.println("Check Copy : "+obj.hotel_add);
	}

}


