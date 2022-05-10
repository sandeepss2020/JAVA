package hotel_manage;
import java.util.Scanner;


class employee_7
	{
	  String name = "Your Hotel";
	  int sal;
	  Scanner src = new Scanner(System.in);
	  
	  
	  static int num = 0;
	  employee_7 arr[];
	  
	  
	  public employee_7[] Employee() 
	  {		  
	    System.out.println("Enter the number of Employees: ");
	    num = src.nextInt();
	    employee_7 arr[] = new employee_7[num];
	    
	    for(int i =0; i<num ; i++)
	    {
	    	src.nextLine();
	    	arr[i] = new employee_7();
	    	System.out.print("Enter Name:");
	    	String buf = src.nextLine();
//	    	System.out.println("buf: " + buf);
	    	arr[i].name = buf;
	    	System.out.print("Enter Salary ");
	    	arr[i].sal =  src.nextInt();
	    }
	    display(arr);
	    return (arr); 	   
	    
	  }
	  
	  public void display(employee_7 arr[])
	    {
		  	
			  System.out.println("Employee Name \t\t Employee Salary ");
			  System.out.println("=====================================");
			  
		    for(int i =0; i<arr.length ; i++)
			    {
			    	System.out.print(arr[i].name+ " ");
			    	System.out.print("\t\t\t RS." +arr[i].sal+" ");
			    	System.out.println("");
			    }
		   
		    System.out.println("\n=============================================");
	    
	    }
	}
	
	class salary extends employee_7
	{
		
		salary() {
			System.out.println("Let's Grow Together!!");
		}
		
	  public employee_7[] setsalary(employee_7 arr1[]) 
	  {
		  if (arr1 ==null)
		  {
			  System.out.println("No Employyes Registered");
		  }
		  
		  else
		  {
			  System.out.println("Enter the Employee Name:");
			  String nm = src.nextLine();
			  
			  for(int i =0 ; i<arr1.length ; i++)
			  {
				  if(!(nm.equals(arr1[i].name)) && i == (arr1.length-1))
				  {
					  System.out.println("Name Not Present..");
				  }
				  else if(nm.equals(arr1[i].name))
				  {
					  System.out.println("Employee Details of "+ super.name);
					  System.out.println("The salary is"+ arr1[i].sal);
					  System.out.println("New Salary:");
					  int upsal = src.nextInt();
					  arr1[i].sal = upsal;
					  System.out.println("Salary updated");
					  break;
				  }
			  }
			  
			  super.display(arr1);
		  }
		  return (arr1);
	  }
	  
	 public void display(employee_7 arr[])
	  {
		  System.out.println("With good Salary Employees work Life should be mentioned");
	  }
	}

	class bonus extends salary
	{
		
		bonus(){
			super();
			System.out.println("A bonus Earned is for your Effort!!");
		}
		public void bonus_sal(employee_7 arr1[])
		{
			if (arr1 ==null)
			  {
				  System.out.println("No Employees Registered");
			  }
			  
			  else
			  {
				  System.out.println("Enter the Employee Name:");
				  String nm = src.nextLine();
				  for(int i =0 ; i<arr1.length ; i++)
				  {
					  if(!(nm.equals(arr1[i].name)) && i == (arr1.length-1))
					  {
						  System.out.println("Name Not Present..");
					  }
					  else if(nm.equals(arr1[i].name))
					  {					  
						  System.out.println("The salary is"+ arr1[i].sal);
						  System.out.println("Enter the number of days Overtime:");
						  int overtime = src.nextInt();
						  if(overtime > 5 && overtime <=10)
						  {
							  arr1[i].sal = arr1[i].sal +(arr1[i].sal / 10);
							  System.out.println("Bonus with Salary" +arr1[i].sal);
							  break;
						  }
						  else if(overtime > 10 && overtime <=20)
						  {
							  arr1[i].sal = arr1[i].sal + (arr1[i].sal / 5);
							  System.out.println("Bonus with Salary" +arr1[i].sal);
							  break;
						  }
						  else if(overtime > 20 && overtime <=31)
						  {
							  arr1[i].sal =arr1[i].sal+ (arr1[i].sal /2 );
							  System.out.println("Bonus with Salary : Rs." +arr1[i].sal);
							  break;
						  }
						  else
						  {
							  System.out.println("Sorry !!Bonus Not available");
						  }
					  }
					  
				  }
				  display(arr1);
			
		}
		
	}
	}
	
	abstract class deduction extends salary
	{
		
		
	}
	
	
	
	class lab7a
	{
		static String name;
		
	  public static void main(String[] args)
	  {
		  Scanner src = new Scanner(System.in);
		  employee_7 obj = new employee_7();
		  System.out.println("Emloyee Details.");
		  System.out.println("=================================");
		  System.out.println("Enter Your Hotel Name :");
		  name = src.nextLine();
		  employee_7 arr1[] = null;
		  boolean val = true;
		  while(val == true)
		  {
			  System.out.println("Press 1 : for Add employees . 2:For Update employee Salary, 3:"
			  		+ "Give Bonus. 4:Deduction . 5:Exit"  );
			  int press = src.nextInt();
			  switch (press)
			  {
				  case 1:
					  arr1 = obj.Employee();
					  
					  break;
					  
				  case 2:
					  salary sl = new salary();
					  arr1 = sl.setsalary(arr1);
					  break;
				  
				  case 3:
					  bonus bn = new bonus();
					  bn.bonus_sal(arr1);
					  
					  break;
					  
				  case 4:
//					  deduction dn = new deduction();
					  
					  break;
					  
				  case 5:
					  val = false;
					  break;
					  
				default :
					System.out.println("Not a Valid Input");
					break;
				  
			  }  
		  }
	  }
	  
	}


