package lab8;
import lab8.*;
import java.util.Scanner;



public class displays implements rooms,login,login.Message
{

	Scanner sr = new Scanner(System.in);

	String uname,password;
	String name,address;
	int members =0 , contact;
	displays arr[];
	displays arr_hotel[];
	
	@Override
	public int in_hotel_detail() 
	{
		System.out.println("Enter the Number of hotel :");
		int h_num = sr.nextInt();
		displays arr_hotel[] = new displays[h_num];
		for(int i =0 ; i<h_num ; i++)
		{
			sr.nextLine();
			arr_hotel[i] = new displays();
			System.out.println("====================================");
			System.out.println("Enter Hotel Name of id: " +(i+1));
			
			arr_hotel[i].name = sr.nextLine();
			System.out.println("Enter Contact Number:");
			arr_hotel[i].contact =sr.nextInt();
			System.out.println("Enter Address:");
			arr_hotel[i].address = sr.nextLine();
		}
		System.out.println("Details Updated");		
		return 0;
	}

	@Override
	public void in_owner()
	{
		if(arr_hotel.length == 0)
		{
			System.out.println("List is Empty");
		}
		else {
		System.out.println("ID\t\t Name \t\t Address \t\t Contact \t\t Owner Name");
		for(int i = 0; i<arr_hotel.length ; i++)
		{
			System.out.print((i+1)+ "\t\t" +arr_hotel[i].name +"\t\t" +arr[i].address);
		}
		}
		
	}

	@Override
	public void admin_login() {
		login.login();
		System.out.println("Enter Your Username Admin : ");
		String admin_username = sr.next();
		if (admin_username.equals("admin")) {
			System.out.println("Enter Password:");
			password = sr.next();
			if(password.equals("admin123"))
			{
				System.out.println("Welcome!!!"  +admin_username);
			}
			else {
				System.out.println("You have entered Incorrect Password.");
				admin_login();
			}
		}
		else
		{
			System.out.println("You Have Entered Wrong Username.");
			admin_login();
		}
		
		}
		

	@Override
	public void user_login()
	{
		System.out.println("Enter the number of users You want to Register:");
		int num = sr.nextInt();
		displays arr[] = new displays[num];
		for(int i =0 ; i<num ; i++)
		{
			sr.nextLine();
			arr[i] = new displays();
			System.out.println("====================================");
			System.out.println("Enter Name of id: " +(i+1));
			
			arr[i].name = sr.nextLine();
			System.out.println("Enter no. of Members:");
			arr[i].members =sr.nextInt();
			System.out.println("Enter Address:");
			arr[i].address = sr.nextLine();
		}
		System.out.println("Details Updated");
		
	}

	@Override
	public void in_rooms() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void msg() {
		// TODO Auto-generated method stub
		
	}
	
	

	public static void main(String[] args) 
	{
		
		Scanner src = new Scanner (System.in);
		displays dis = new displays();
		dis.admin_login();
		System.out.println("Enter 1 : To Register Users, 2:Hotel Details , 3:See Hotel And Owners,"
				+ "4:Room Details , 5: Display , 6:EXIT");
		int num = src.nextInt();
		boolean check = true;
		while (check == true) {
		switch (num) {
		case 1: {
			dis.user_login();
			break;
		}
		
		case 2: {
			dis.in_hotel_detail();
			break;
		}
		
		case 3: {
			dis.in_owner();
			check = false;
			break;
		}
		default:
			throw new IllegalArgumentException("Unexpected value: " + num);
		}
		}
	}

}
