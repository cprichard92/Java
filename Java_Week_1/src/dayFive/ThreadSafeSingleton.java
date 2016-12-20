package dayFive;

public class ThreadSafeSingleton {
	public static void main(String[] args) {
	new Thread(new Runnable() {
		@Override
		public void run() {
			Singleton obj1 = Singleton.getInstance();
			System.out.println(obj1);
		}
	}).start();
	
	new Thread(new Runnable(){ 
		@Override
		public void run() {
			Doubleton obj2 = Doubleton.getInstance();
			System.out.println(obj2);
			
		}
	}).start();
	
	Singleton obj1 = Singleton.getInstance();
	Singleton obj2 = Singleton.getInstance();
	System.out.println(obj1);
	System.out.println(obj2);
}

static class Doubleton{
	private static Doubleton INSTANCE;
	private Doubleton(){  };
	public synchronized static Doubleton getInstance(){	
		if( INSTANCE == null){
			INSTANCE = new Doubleton();
		}
		return INSTANCE;
	}
}

static class Singleton{
	private static Object lock = new Object();
	private static Singleton INSTANCE;
	private Singleton(){  };
	public static Singleton getInstance(){	
		/*
		 * code doesn't need to be sync example
		 * #1 examples: local variables
		 */
		for(int i=0;i<10;i++) System.out.println("Unsynced");
		synchronized (lock) {
			if(INSTANCE==null){
				INSTANCE= new Singleton();
			}
		}
		
		/*
		 * code doesn't need to be sync example
		 * #1 examples: local variables
		 */
		for(int i=0;i<10;i++) System.out.println("Unsynced");
		synchronized (lock) {
			if( INSTANCE == null){
				INSTANCE = new Singleton();
			}
			return INSTANCE;
		}
	}
}}