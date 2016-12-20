package Strings;

//One and only one
//Resource-intensive component
public class SingletonPattern {

	public static void main(String[] args) {
		//HeavyThing thing= new HeavyThing();
		HeavyThing thing = HeavyThing.getInstance();
		HeavyThing thing2 = HeavyThing.getInstance();
		System.out.println(thing);
		System.out.println(thing2);
		
		LazyThing thing3 = LazyThing.getInstance();
		LazyThing thing4 = LazyThing.getInstance();
		System.out.println(thing3);
		System.out.println(thing4);
	}
	
}

class HeavyThing /*	implements HeavyComponent*/{
	static{
		System.out.println("Class being loaded by ClassLoader");
	}
	private static HeavyThing INSTANCE = new HeavyThing(); // eagerly loaded
	private HeavyThing(){
		System.out.println("constructing HeavyThing");
	}
	public static HeavyThing getInstance(){
		return INSTANCE;// can only be called within this class
	}
}

class LazyThing /*	implements HeavyComponent*/{
	private static LazyThing INSTANCE; // eagerly loaded
	private LazyThing(){}
	public static LazyThing getInstance(){
		//THIS IS NOT THREAD SAFE
		if(INSTANCE == null) INSTANCE = new LazyThing();
		return INSTANCE;// can only be called within this class
	}
}