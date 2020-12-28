package com.thread.runnable;

public class MyRunnableThread implements Runnable{
	
	public static int myCount = 0;
	
	public MyRunnableThread() {
		
	}
	
	@Override
	public void run() {
	  while(MyRunnableThread.myCount <=10) {
		  try {
			  System.out.println("Expl Thread: "+(++MyRunnableThread.myCount));
			  Thread.sleep(100);
		  } catch(InterruptedException iex) {
			  System.out.println("Exception in thread: "+iex.getMessage());
		  }
	  }
		
	}

	public static void main(String[] args) {
		System.out.println("starting MainThread...");
		MyRunnableThread mrt = new MyRunnableThread();
		Thread t = new Thread(mrt);
		t.start();
		
		while(MyRunnableThread.myCount <=10){
			try {
				  System.out.println("Main Thread: "+(++MyRunnableThread.myCount));
				  Thread.sleep(100);
			  } catch(InterruptedException iex) {
				  System.out.println("Exception in thread: "+iex.getMessage());
		}

	}
		System.out.println("End of MainThread...");
	}

	

}
