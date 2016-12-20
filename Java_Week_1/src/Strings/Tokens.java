package Strings;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Tokens {
	
	static String csv = "Apples, \\Orange,         Pickle,Kiwi, Banana";
	static String csv2 = "Apple, Orange, Pickle,Kiwi\n, Banana";

	public static void main(String[] args) {
		StringTokenizer tokenizer = new StringTokenizer(csv, ",");
													//String to parse, "," is the delmiter
		while (tokenizer.hasMoreTokens()){
			System.out.println(tokenizer.nextToken());
			
		while (tokenizer.hasMoreTokens()){
			System.out.println(tokenizer.nextToken().trim());
		}
		}
		
		Scanner scanner = new Scanner(csv2); //newer, more efficenit way of maniplation entries
		scanner.useDelimiter("\n");
		while(scanner.hasNext())
		{
			Scanner linescanner = new Scanner(scanner.nextLine());
			linescanner.useDelimiter(",");
			
			while(linescanner.hasNext())
			{
				System.out.println(linescanner.next());
			}linescanner.close();
		}scanner.close();
	}
}
