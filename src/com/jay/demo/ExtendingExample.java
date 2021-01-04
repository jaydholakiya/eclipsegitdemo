package com.jay.demo;

public class ExtendingExample
{
	public static void main(String[] args)
	{
		Count count = new Count();
		while(count.isAlive())
		{
			System.out.println("Main thread will be alive till the child thread is live");
			try
			{
				Thread.sleep(1500);
			}
			catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("Main thread's run is over" );
	}
}