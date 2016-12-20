package Strings;

public class CommandLineArguments{
		
		//						command-line arguments
	//Java CommandLineArguments arg1 arg2 arg3 arg4
	//Space  delimited arguments
		public static void main(String... args) {
			for(String x : args) System.out.println(x);
			add("String",1,3,5,7,9);
		}
		
		public static void main(String args) {
			System.out.println("This won't run");
		}
		
		public void addition(){
			
		}
		
		public static int add(String x, int... args){
			int sum=0;
			for(int i : args){
				sum +=i;
			}return sum;
		}
}
