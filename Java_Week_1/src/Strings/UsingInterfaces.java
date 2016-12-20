package Strings;

//Interfaces are used to decouple components

public class UsingInterfaces {
	
	public static void main(String[] args) {
		Connection con = DriverManager.getConnection("POSTGRES");
		con.sendSQL("select * from brain");
	}
}

//Factory design pattern
class DriverManager{
		public static Connection getConnection(String database){
			switch(database){
			//Databases that Can be Connected
			case "ORACLE":{
				return new OracleConnection();
			}
			case "POSTGRES":{
				return new PostgresConnection();
			}default:{
				return new TeradataConnection();
			}
		}
	}
}

interface Connection{
	int connectionNumber = 10; //Auto public static final even though they are not listed (implcited (assume) stated) 
	public void sendSQL(String sql); //Auto public static final even though they are not listed (implcited (assume) stated)
	public abstract void connect();
}

interface DatabaseConnection extends Connection{ //implemnets means you can override a method, but interface can not be overriden
	
}

class OracleConnection implements Connection{
	@Override
	public void sendSQL(String sql){
		System.out.println("Sending " + sql + " to Oracle");
		
	}
	
	public void connect(){
		System.out.println("Connecting to Oracle");
	}
}

class PostgresConnection implements Connection{
	@Override
	public void sendSQL(String sql){
		System.out.println("Sending " + sql + " to Postgres");
	}
	
	public void connect(){
		System.out.println("Connecting to Postgres");
	}
	
}

class TeradataConnection implements Connection{
	public void sendSQL(String sql){
		System.out.println("Sending " + sql + " to Teradata");
	}
	
	public void connect(){
		System.out.println("Connecting to Teradata");
	}
}