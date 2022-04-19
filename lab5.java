package hotel_manage;
import java.util.Scanner;


class room_detail
{
	Scanner src = new Scanner (System.in);
	static
	{
		System.out.println("CHECK YOUR BEST Room Here !!");
	}
	
	static int room_id = 100;
	int hotel_id;
	String name;
	int price, price2;
	static int count1 =0;
	static int count2 =0;
	void room_detail(int hotel_id,String name)
	{
		this.name = name;
		System.out.println("Welcome to " +name);
		System.out.println("Enter Room Details");
		this.hotel_id = hotel_id;
		//if(hotel_id ==(this.hotel_id)) {
			System.out.println("Number oF AC Rooms:");
			int ac= src.nextInt();
			System.out.println("Number oF NON-AC Rooms:");
			int nac= src.nextInt();
			status(ac,nac);
	}

	int status(int ac,int nac)
	{
		for(int i =0; i<ac ;i++)
		{
			room_id++;
			System.out.println("Status of"+room_id+"AC room");
			System.out.println("Vacant press :0 ; Available press:1");
			int position =src.nextInt();
			if(position == 0)
			{
				count1++;
			}
			else
			{
				count2++;
			}
		}
		// Profit ANd loss : suppose ac room -> 2000
		this.price = count1 *2000;
		this.price2 = count2 *2000;
		if(count1 >= 3)
		{
			System.out.println("You Need some Customers");
			System.out.println("Rooms vacant "+count1 +" Cost : "+(price-price2));
		}
		else {
			System.out.println("Wohooo You are in profit:");
			System.out.println("Rooms vacant "+count1 + " Rooms filled "+count2 +", Profit :"+(price2-price));

		}
		
		return price;
	}
	room_detail()
	{
		System.out.println("Enter Hotel ID:");
		int id = src.nextInt();
		src.nextLine();
		System.out.println("Hotel Name :");
		String name = src.nextLine();
		room_detail(id,name);

	}
}	
class specification extends room_detail
{
	String name = "Owner Name  : Jack";
	void specification() 
	{
		System.out.println("Thanks And Regards "+super.name+"Hotel");
		System.out.println(name);
		
	}
}

public class lab5
{

	public static void main(String[] args) 
	{
//		Scanner src = new Scanner (System.in);
		specification sn = new specification();
		sn.specification();
		
	}

}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//		System.out.println("Press 1 : Update Room Details.");
//		System.out.println("Press 2 : Check Status.");
//		System.out.println("Press 3 : Exit");
//		int choice = src.nextInt();
//		do
//		{
//			switch(choice)
//			{
//				case 1:
//					room_detail obj = new room_detail();
//					
//					break;
//				
//				case 2:
////					display();
//					break;
//				
//				case 3:
//					break;
//					
//				default:
//					System.out.println("Enter the Right input!!");
//					break;
//			}
//		}while(choice == 3);
		

