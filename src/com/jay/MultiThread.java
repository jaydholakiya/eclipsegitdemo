package com.jay;

public class MultiThread extends Thread
{
	public void run()
	{
		int i;
		for(i=0;i<=10;i++)
		{
			System.out.println(">> from 1 ->-------- " + i);
		}
	}
}