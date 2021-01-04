package com.jay;

public class MultiThread1 extends Thread
{
	public void run()
	{
		int i;
		for(i=0;i<=10;i++)
		{
			System.out.println(">> from -> " + i);
		}
	}	
}