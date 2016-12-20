package dayThree;

import java.net.Socket;

public class GarbageCollection {

	public static void main(String[] args) {

		PizzaBox ref = new PizzaBox(); // object is ready for garage collection since ref is pointing to a new box
		new PizzaBox(); //object is ready for collection due the next ref below = null 
		new GarbageCollection().go();
		ref = new PizzaBox();
		ref = new PizzaBox();
		ref = null;
		// You can not force collection, but you can request it
		System.gc();
		for(int i=0; 1<1000000;i++){
			new PizzaBox(); //temporary object
		}
	}
	
	public void go(){
		
		PizzaBox ref = new PizzaBox(); //out of scope
		//ref is 'eligible for garbage collection since it's directly in the method
	}

}

class PizzaBox{
	Socket socket;
	public void eat(){}
	@Override
	protected void finalize() throws Throwable {
		super.finalize();
		//last chance to gracefully close your resources
		/*if( ! socket.isClosed()){
			socket.close();
		}*/
		/*Demo*/
		while(true)
			System.out.println("cleaing up...");
	}
}