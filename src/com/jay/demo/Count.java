package com.jay.demo;

public class Count extends Thread
{
	public Count()
	{
		super("My existing thread");
		System.out.println("My thread created " + this);
		start();
	}
	
	public void run()
	{
		for(int i=0;i<=10;i++)
		{
			System.out.println("Printing the count " + i);
			try
			{
				Thread.sleep(1000);
			}
			catch (InterruptedException e)
			{
				e.printStackTrace();
			}
			catch (Exception e)
			{
				System.out.println("My thread interrupted...");
			}
			System.out.println("Main thread's run is over");
		}
	}
}