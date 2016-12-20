package dayFive;

import java.nio.charset.MalformedInputException;

public class ThreadSync {
	
	private int variable = 0 ;
	
	public synchronized void increment(){
		variable++;
	}

	public void work() throws InterruptedException{
		Thread t1  = new Thread(  new Runnable(){ // anonymous class - never going to use the class again
//			private int id=0;
//			private void go(){};
			@Override
			public void run() {
				for(int i=0;i<10_000;i++)
					increment();
			}
		}); // method-local class
		
		Thread t2 = new Thread( new Runnable(){

			@Override
			public void run() {
				for(int i=0;i<10_000;i++)
					increment();
			}
		});
		t1.start();
		t2.start();
		System.out.println("pausing main here");
		t1.join(); // main thread stops until t1 finishes
		t2.join(); 
		System.out.println(variable);
}
	
	public static void main(String[] args) {
		try {
			new ThreadSync().work();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
	
