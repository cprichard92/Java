package week1;
public class Overloading {
	public static void main(String[] args)
	{
		Mathematics.calculate(15);
	}
}

class Mathematics{
	public static void calculate(int x){
		System.out.println("Integer");
	}
	public static void calculate(long x){
		System.out.println("Long");
	}
}
