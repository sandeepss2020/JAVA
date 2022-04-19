package hotel_manage;
import java.util.*;

class Employee
{
	static int emp_id = 1;
	static int count = 1;
	static int n =0;
	
	static
	{
		System.out.println("Welcome to Hotel TAJ __/\\__");
		System.out.println("Bonus For Employees.");
	}
	
	static class highest
	{
		float average = 0;
		float temp =0;
		float highest_sal(int num ,int arr1[])
		{
			for (int i =0; i<num ; i++)
			{					
					if (arr1[i]>temp)
					{
						temp = arr1[i];
					}
					else if(arr1[i] == 0)
					{
						continue;
					}
					else
					{
						return temp;
					}
			}
			return temp;
		}
		float avg(int num ,int arr1[])
		{
			for (int j = 0 ;j<num ; j++)
			{
				average = arr1[j]+average;
			}
			average = average / num;
			return average;
		}
	}
	static private int bonus(int num,float g_money, float day)  //int day is not working ?? why
	{
		
		
//		System.out.println("Day =" +day);
//		System.out.println("Salary =" +g_money);
//		float money = 0;
		if(day > 300 && day <= 366)
		{
			g_money = g_money + (g_money/2); //50%
		}
		else if (day >= 250 && day <= 300) {
			g_money = g_money + ( g_money * 3/10);  //30%
		}
		else if (day >= 200 && day < 250) {
			g_money = g_money + ( g_money / 4);  //30%
		}
		else if (day >= 100 && day < 200) {
			g_money = g_money + ( g_money /5);  //30%
		}
		else
		{
			return (int)g_money;
		}
		
		return (int)g_money;
	}
	
	static void bonus(int num, String arr[][])
	{
		Employee.highest obj2 = new Employee.highest();
		int[] arr1 =new int[num];
		for(int j = 0; j< num ; j++)
		{
			for(int k = 0; k<1 ; k++)
			{
				System.out.println("=========================================");
				System.out.println("Id : " +emp_id);
				System.out.println("Employee Name : " +arr[j][k]);   //??it is not printing
				System.out.println("Salary : " +arr[j][k+1] );
				int day = Integer.parseInt(arr[j][k+1]);
				System.out.println("Number Of Days Worked : "+arr[j][k+2]);
				float salary  = Integer.parseInt(arr[j][k+2]);
				System.out.println("Total Salary with Bonus is :"+bonus(num,day,salary));
				arr1[n] = bonus(num,day,salary);
				n++;
				emp_id++;
			}
			
		}
		System.out.println("=========================================");
		System.out.println("Highest Salary :"+obj2.highest_sal(num,arr1));
		System.out.println("Average Salary is : "+obj2.avg(num,arr1));
		
	}
	
	
	}



public class lab4 
{
	public static void main(String[] args) 
	{
		
		Employee obj = new Employee();
		Employee.highest obj2 = new Employee.highest();
		Scanner src = new Scanner(System.in);
		System.out.println("Enter the number of Employees : ");
		int num = src.nextInt();
		
		String[][]arr = new String [num][3];
		for(int j = 0; j< num ; j++)
			{
				for(int k = 0; k<1 ; k++)
				{
					System.out.println("Emp id " +obj.count);
					System.out.println("Employee Name : ");
					arr[j][k] = src.nextLine();
					src.nextLine();
					System.out.println("Enter Salary : ");
					arr[j][k+1] = String.valueOf(src.nextInt());
					
					System.out.println("Enter Number Of Days Worked : ");
					arr[j][k+2] = String.valueOf(src.nextInt());
					
					obj.count++;
				}
			}
		
		obj.bonus(num,arr);
	}
	
}
