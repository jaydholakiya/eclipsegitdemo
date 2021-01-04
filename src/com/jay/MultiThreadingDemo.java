package com.jay;

public class MultiThreadingDemo
{
	public static void main(String[] args)
	{
		MultiThread multiThread = new MultiThread();
		try {
			multiThread.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		multiThread.start();
		
		MultiThread1 multiThread1 = new MultiThread1();
		multiThread1.start();
		
	}
}