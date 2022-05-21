package hotel_manage;

class test extends Thread
{
	public void run()
	{ 
		try
		{
			System.out.println("Thread TEST Name " +Thread.currentThread().getName());
			for(int i = 5 ; i >=0 ; i--)
			{
				 
				System.out.println("You Are Connecting in...: "+i);
				Thread.sleep(1000);
			}
		}
		catch (Exception e) {
			System.out.println(e);
		}
		
	}
}

class booking extends Thread
{
	public void run()
	{
		System.out.println("Thread Booking Name " +Thread.currentThread().getName());
		try
		{
			System.out.println("Booking of room Calculation Starts");
			Thread.sleep(3000);
			System.out.println("Bokking Calculation Done");
			
		}
		catch (Exception e)
		{
			System.out.println(e);
		}
	}
}



class totalearning extends Thread
{
	int total = 0;
	public void run()
	{
		synchronized(this)
		{
			for(int i =0; i <=15; i++)
			{
				total = total + 500;
			}
			this.notify();
		}
	}
}


public class thread_lab
{

	public static void main(String[] args) throws InterruptedException
	{
		System.out.println("Thread MAIN Name " +Thread.currentThread().getName());
		totalearning te = new totalearning();
		test t = new test();
		booking bk = new booking();
		bk.start();
		te.start();
		t.start();
		
		synchronized (te)
		{
			t.join();
			System.out.println("Welcome to the Finance of The Taj Hotel");
			te.wait();
			
			bk.yield();
			System.out.println("Total Earnings : " +te.total + " Rs");
		}	
	}

}
