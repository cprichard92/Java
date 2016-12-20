package week1;
public class Loop{
	public static void main (String[] args)
	{
		//controlled loop
		for(int i=0; i<2; i++){
		System.out.println(i);
		}
		
		//Array Length
		int[] array = {1,2,3,4,5,6,7,8,9};
		System.out.println("");
		System.out.println(array.length);
		System.out.println("");
		
		//controlled loop, printing out the array length
		for(int index=0; index < array.length; index+=2){
			System.out.println(array[index]);
		}
		System.out.println("");
		for( int a: array){//same code but all or nothing
			System.out.println(a);
			if(a == 5){
				break; //terminated the loop
				//continue; //terminate 1 iteration of the loop
			}
		}
		
		System.out.println("");
		
		//sentiel -controlled loop
		boolean flag = false;
		double x = 0;
		while(flag!=true){
				System.out.println("looping");
				if(Math.random() > .75) {
					flag=true;
				}
		}
		
		System.out.println("");
		//sentiel -controlled loop
		boolean pong = false;
		double y = 0;
		do{
			System.out.println("looping");
			if(Math.random() > .75) {
				pong=true;
			}
		}while(pong!=true);
	}
}