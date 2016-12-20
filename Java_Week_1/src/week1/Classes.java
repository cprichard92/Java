package week1;
public class Classes
{
	//Defines state and behavior of an object
	//1. Class variable = static
	static int classVariable; // one copy of this variable---ever!! All instances share this one variable
	static int instanceCount;
	static final short freezingTemp = 32; //"Final" prevents a variable from being changed
	
	public Classes()
	{
		instanceCount++;//Counts everytime the Classes method is called
	}
	
	//State = data
	//Instance Scope
	int number = 2_000_000_000;//primative data type
	boolean b = true;
	//-128 -> 127		//bytecode -> JVM Instructions
	byte by = 'a'; //ASCII 
	double db = 92;
	long l = 96852;
	float f = 84_261_051_563_120L;
	short s = 32000;
	char c = 97;
	
	String word = new String("String");//another class
	String word2 = "String";
	
	//Behavior = Action
	void method()
	{
		//Once called the action will be taken within the method
		char color = c;	//3. Method Scope
		System.out.println("Print to Console");
		System.out.println(by);	
	}
	
	public static void main(String[] args) //entry point Java application
	{
		Classes var = new Classes();
		var.method();
	}
}
