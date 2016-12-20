package dayFive;

/*
 * Faster applications
 * Asynchronous processing -> forking your processing
 */

public class MultithreadingExample{
	
	public static void main(String[] args) { //main "process"
	
		ZeroThread zero = new ZeroThread();
		zero.start(); // You must have start to run the method
		//zero.run(); Will not run by calling run()
		
		AxtonThread axt = new AxtonThread();
		Thread king = new Thread(axt);
		king.start();
		
		while(true)
		{
			System.out.println("Borderlands 2 is running");
			try{
				Thread.sleep(1000);
			}catch(InterruptedException e){
				e.printStackTrace();
			}
		}
	}
}

class AxtonThread implements Runnable{
	
	private void slow(){
		try{
			Thread.sleep(1000);
		}catch (InterruptedException e){
			e.printStackTrace();
		}
	}
	
	@Override
	public void run() {
		// payload -> what to do when you start
		while(true){
			if(Math.random() < 0.1){
				System.out.println("Axton deploying turrets");
				slow();
			}
			else{
				System.out.println("Axton is taking damage");
				slow();
			}
		}
	}
}

class ZeroThread extends Thread{
	
	private void slow(){
		try{
			Thread.sleep(1000);
		}catch (InterruptedException e){
			e.printStackTrace();
		}
	}
	
	@Override
	public void run() {
		//payload -> what to do when you start
		while(true)
		{
			if(Math.random() < 0.1){
				System.out.println("Zero say haiku");
				slow();
			}
			else{
				System.out.println("Zero is using his samurai sword");
				slow();
			}
		}
	}
}