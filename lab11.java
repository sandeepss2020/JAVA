package hotel_manage;
import java.io.*;
class welcome extends Thread {
	public void run()
	{
	while (true) {
	try {
        System.out.println("Thread " + Thread.currentThread().getId() + " is running");
        
    	}
    catch (Exception e) {        
    					System.out.println("Exception is caught");
    					}
				}
		}
}
class GFG implements Runnable {
   
    @Override 
    public void run()
    {
        System.out.println("\nInside run method");
    }
}


public class lab11{
    public static void main(String[] args)
    {
        welcome obj = new welcome();
        obj.start(); 
        GFG gfg = new GFG();
        Thread t = new Thread(gfg, "gfg");
        t.start();
        System.out.println(t.getName());
    }
}