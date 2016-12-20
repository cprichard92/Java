package dayThree;

import org.omg.CORBA.INITIALIZE;

public class WrapperClasses {
	
	public static void main(String[] args) {
		//Decorator: take an object and wrap it inside another to add functionality
		
		//Pre-Java 5
		int num=500;
		Integer i = new Integer(num); // boxing: 
		int unbox = i.intValue();// un-boxing: 
		
		// After Java 5 "Autoboxing"
		int number = 100;
		Integer x = number; //boxing
		number = x; //un-boxing
		
		doWork(number);
		x++;
		x = x+100;
		
		Character c;
	}
	
	public static void doWork(Integer i){
		
	}

}
