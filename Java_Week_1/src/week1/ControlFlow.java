package week1;
public class ControlFlow
{
	public static void main (String[] args)
	{
		int y = 2;
		int x = 900;
		boolean condition = (x > 100);
		
		int z = (x>y)? 90:0;
		
			if(x < 20 & y > 80)
			{
				System.out.println("true");
			}
			else
			{
				System.out.println("false");
			}
			System.out.println(y);
			System.out.println("Done");
	}
	
	public static void betterOption(int x)
	{
		switch(x){
			case 0:{
					System.out.println("0");
					break;
			}
			case 10:{
					System.out.println("10");
					break;
			}
			case 20:{
					System.out.println("20");
					break;
			}
		}
	}
	
	public class Loop{
			public void main (String[] args)
			{
				for(int i=0; i<10; i++){
					System.out.println(i);
				}
			}
	}
}