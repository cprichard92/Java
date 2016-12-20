package dayThree;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class FinallyBlock {
		
	public static void method() throws IOException{}
		
	public static void main(String[] args) throws IOException{
		//Auto-closable (try-with resources)
		try(Scanner scan = new Scanner(System.in);
				FileInputStream fis = new FileInputStream("file.txt")){//declare resources in your try block
			//1. Use the resources
			//2. Auto-Close the resources at end of the try block
			fis.read();
		}
		
		Scanner scanner = null;
		try {
			scanner = new Scanner(System.in);
			method();
			//system.exit(0);
		}finally{// Exiting code regardless if exception is thrown
			scanner.close();
		}
		
		try{
			scanner = new Scanner(System.in);
			method();
		}finally{// Exiting code regardless if exception is thrown
			scanner.close();
		}
	}
}
