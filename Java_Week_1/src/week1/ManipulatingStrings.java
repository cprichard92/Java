package week1;

public class ManipulatingStrings {
	
	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder("Java");
		sb.append("One").append(" ").append("Java"); //Doesn't create a string, creates an array and puts char in array
		
		new StringBuilder(50); //Char limit for your string array
		StringBuilder sb2 = new StringBuilder(" was fun!");

		//sb= sb + sb2; Doesn't work .... Use the append method in the StringBuilder API
		String example = "String 1" + " " + "String2"; //Creates 4 strings in the String pool using additional memory
		// StringBuffer -> thread-safe version of StringBuilder
	}
}
