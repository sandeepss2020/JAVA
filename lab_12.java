package hotel_manage;
import java.util.*;

class display
{
	void display()
	{
		System.out.println("+++++++++++++++++++++++++++++++++++++++");
		System.out.println("Welcome to Bangalore MANAGEMENT System");
	}
	void display (ArrayList ar1 , ArrayList ar2)
	{
		System.out.println("ID\t Hotel NAME");
		System.out.println("--------------------------------------------");
		for(int i =0 ; i<ar1.size() ;  i++)
		{
			System.out.println(ar1.get(i)+ "\t" + ar2.get(i));
		}
	}
	
	void display (ArrayList ar1 , LinkedList ar2)
	
	{
		System.out.println("ID\t Hotel NAME");
		System.out.println("--------------------------------------------");
		for(int i =0 ; i<ar1.size() ;  i++)
		{
			System.out.println(ar1.get(i)+ "\t" + ar2.get(i));
		}
	}
}
//contains, addall, set
//addlast
class update
{
	static void update(ArrayList ar1,ArrayList ar2, Scanner src)
	{
		ArrayList<Integer> al1 = new ArrayList<>();
		LinkedList<String> ll1 = new LinkedList<>();
		System.out.println("EnterHow Many More Hotels You want to add :");
		int id = src.nextInt();
		for (int i = 0; i<id; i++)
		{
			System.out.println((i+1) +") Enter Hotel Id :");
			al1.add(src.nextInt());
			System.out.println("Enter Hotel Name:");
			ll1.add(src.next());
		}
	
		al1.addAll(ar1);
		ll1.addAll(ar2);			//addlast
		display ds = new display();
		ds.display(al1,ll1);
	}
}


public class lab_12 
{

	public static void main(String[] args)
	{
		display ds = new display();
		Scanner src = new Scanner (System.in);
		ArrayList<Integer> al1 = new ArrayList<>();

		System.out.println("Enter the Number of Hotels You want to register :");
		int num = src.nextInt();
		ArrayList<String> al2 = new ArrayList<>(num);
		for(int i =0 ; i<num ; i++)
		{
			System.out.println((i+1) +") Enter Hotel Id :");
			al1.add(src.nextInt());
			System.out.println("Enter Hotel Name:");
			al2.add(src.next());
		}
		ds.display();
		ds.display(al1,al2);
		update up = new update();
		up.update(al1,al2,src);
	}

}
