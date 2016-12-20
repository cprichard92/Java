package dayThree;

import java.io.IOException;
import java.sql.SQLException;

public class ExceptionHandling{
	
	public static void main(String[] args) {
		try {
			run();
		} catch (IOException e) {
			e.printStackTrace();
			System.out.println("IOException");
		}
		System.out.println("Done");	
	}
		
	public static void run() throws IOException{
		try {
		go();
			if(false)
			throw new SQLException();
		} catch (IOException | SQLException | NullPointerException e) {//multiple catch exceptions
			System.out.println("SQLExcepton");
		}
	}
	
	public static void go() throws IOException, SQLException, NullPointerException{ //Warning this method does I/O
		throw new IOException("Lost Connectivity"); //Manually throws an exception
	}
}
