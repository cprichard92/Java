package week1;

public class Constructor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pickle p = new Pickle("Dill");
//		Ant a = new Ant(1);
	}
}

class Vegatable{
	int weight;
	public Vegatable(){
		System.out.println("Veggie constructor");
	}
}

class Cucumber{
	public Cucumber(){
		System.out.println("Cucumber constructor");
	}
}

class Pickle extends Cucumber{
	String flavor;
	String color;
	//default constructor -> auto given no-arguments by JVM
	public Pickle(String flavor) {
		super();
		System.out.println("Pickle 1-arg constructor");
		this.flavor = flavor;
		this.color = "Green";
	}
	
	public Pickle(){
		super(); //implicitly called
		System.out.println("Pickle Constructor");
	}
}

//public void Ant(){
//	this(1);
//}

//public void Ant(int y){
//	this();
//}