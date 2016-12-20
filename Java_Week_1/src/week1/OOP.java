package week1;
/*

*/


public class OOP
{
	public static void main (String[] args)
	{
		//Person p = new Person();
		//p.setAge(-100);
		
		Animal[] zoo = new Animal[2];
		zoo[0] = new HouseCat();
		zoo[1] = new Lion();
		for(Animal temp : zoo){ //-each loop (any array or Collection
			temp.sleep();
		}
	}
}

//4. Inheritance = Inherit state in behavior from a class being called "Extends". You can only inherit from one class
abstract class Animal
{
	String species = "Animal";
	public void sleep(){
		//1000s of lines
		System.out.println("zZzZzZZz");
	};
	public abstract void eat(); //enforces this behavior from subclasses
}

//2. Abstraction = Hides complexity (Examples: Servlets)
abstract class Feline extends Animal
{
	String breed;
	
	public void purr(){System.out.println("prr");}
	public void fest()
	{
		this.eat();
	}
}

//3. Polymorphism = Can inherit traits from parent class, but can also have it's own method and behviors
//a. Override methods
//b. Overload methods
//c. Reference an object as its parent
class HouseCat extends Feline{

	@Override
	public void eat() {
	
		// TODO Auto-generated method stub
		System.out.println("nibble on cat food");
	}
	
	@Override
	public void sleep(){
		System.out.println("Housecat sleepign pecfully");
	}
	
	//The arguments in the method determines which method is called
	public void sleep(int y, int x){}//overloading
	public void sleep(String y, int x){}//overloading
	public void sleep(int y, String x){}//overloading
}

class Lion extends Feline{
	
	@Override
	public void sleep(){
			System.out.println("Lions sleep with one eye open");
	}

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		
	}
}


//1. Encapsulation = private variables that can not change 
	class Person
	{
		private int age;
		public void setAge(int age)
		{
			if(age <0) throw new IllegalArgumentException("Must be > 0");
			this.age = age;
		}
		
		public int getAge()
		{
			return age;
		}
	}
