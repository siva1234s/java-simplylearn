package com.Multithreading;

public class Threadclass extends Thread {

	public void run()
 	{
  		System.out.println("concurrent thread started running..");
}
 	public static void main( String args[] )
 	{
 		Threadclass th = new  Threadclass();
  		th.start();
 	}
}

