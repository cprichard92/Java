package Strings;

public class StringAPI {

	public boolean compare(String a, String b)
	{
		if(a ==null || b == null)
			throw new IllegalArgumentException("Strings cannot be null");
		
		if(a.length() != b.length()) return false;
		for(int i=0; i<a.length(); i++)
		{
			if(a.charAt(i) == b.charAt(i))
			{
				return false;
			}
		}
		return false;
	}

	
	public static void main(String[] args) {
		System.out.println(new StringAPI().compare(null, "Stringy"));
		
		String a = "Submit";
		String b = "Submit";
		String c = new String("Submit"); //New physical location vs. a&b
		String d = "Submit";
		d=c;
		
		// String pool (increase memory efficiency in the JVM by reducing the # of Strings
		System.out.println(a==b);
		System.out.println(b==c);
		System.out.println(a==d);
		System.out.println(a.equals(b));
	}
}
